package fossils.fossils.client.blockentity.model.vampyrum;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class VampyrumFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart body2;
	private final ModelPart body5;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body6;
	private final ModelPart chest;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart manus;
	private final ModelPart digit2;
	private final ModelPart digit2phalanx;
	private final ModelPart digit2phalanx2;
	private final ModelPart digit3;
	private final ModelPart digit2phalanx3;
	private final ModelPart digit2phalanx4;
	private final ModelPart digit4;
	private final ModelPart digit2phalanx5;
	private final ModelPart digit2phalanx6;
	private final ModelPart digit;
	private final ModelPart digit5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart manus2;
	private final ModelPart digit6;
	private final ModelPart digit2phalanx7;
	private final ModelPart digit2phalanx8;
	private final ModelPart digit7;
	private final ModelPart digit2phalanx9;
	private final ModelPart digit2phalanx10;
	private final ModelPart digit8;
	private final ModelPart digit2phalanx11;
	private final ModelPart digit2phalanx12;
	private final ModelPart digit9;
	private final ModelPart digit10;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCanine;
	private final ModelPart rightCanine;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart tail;

	public VampyrumFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.hips.getChild("bone");
		this.bone6 = this.hips.getChild("bone6");
		this.body2 = this.hips.getChild("body2");
		this.body5 = this.body2.getChild("body5");
		this.body = this.body5.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body6 = this.body3.getChild("body6");
		this.chest = this.body6.getChild("chest");
		this.bone4 = this.chest.getChild("bone4");
		this.bone5 = this.chest.getChild("bone5");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.manus = this.leftarm2.getChild("manus");
		this.digit2 = this.manus.getChild("digit2");
		this.digit2phalanx = this.digit2.getChild("digit2phalanx");
		this.digit2phalanx2 = this.digit2phalanx.getChild("digit2phalanx2");
		this.digit3 = this.manus.getChild("digit3");
		this.digit2phalanx3 = this.digit3.getChild("digit2phalanx3");
		this.digit2phalanx4 = this.digit2phalanx3.getChild("digit2phalanx4");
		this.digit4 = this.manus.getChild("digit4");
		this.digit2phalanx5 = this.digit4.getChild("digit2phalanx5");
		this.digit2phalanx6 = this.digit2phalanx5.getChild("digit2phalanx6");
		this.digit = this.manus.getChild("digit");
		this.digit5 = this.manus.getChild("digit5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.manus2 = this.rightarm2.getChild("manus2");
		this.digit6 = this.manus2.getChild("digit6");
		this.digit2phalanx7 = this.digit6.getChild("digit2phalanx7");
		this.digit2phalanx8 = this.digit2phalanx7.getChild("digit2phalanx8");
		this.digit7 = this.manus2.getChild("digit7");
		this.digit2phalanx9 = this.digit7.getChild("digit2phalanx9");
		this.digit2phalanx10 = this.digit2phalanx9.getChild("digit2phalanx10");
		this.digit8 = this.manus2.getChild("digit8");
		this.digit2phalanx11 = this.digit8.getChild("digit2phalanx11");
		this.digit2phalanx12 = this.digit2phalanx11.getChild("digit2phalanx12");
		this.digit9 = this.manus2.getChild("digit9");
		this.digit10 = this.manus2.getChild("digit10");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCanine = this.head.getChild("leftCanine");
		this.rightCanine = this.head.getChild("rightCanine");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
		this.bone3 = this.jaw.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.tail = this.hips.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2765F, -7.2454F, 6.7007F, -0.6674F, -0.2884F, -0.2704F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 5).addBox(1.9F, -1.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.05F, 0.106F, -1.9234F, -1.5708F, -1.3265F, 1.5708F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 6).addBox(-0.55F, 0.8F, -2.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0828F, -1.3178F, -0.2443F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6414F, 0.129F, -0.1479F, -0.1818F, 0.4397F, -1.7838F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4308F, 8.4157F, -0.1798F, 1.7853F, 0.0638F, -1.5146F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 9.9709F, -0.7907F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.9606F, -0.315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6414F, 0.129F, -0.1479F, -0.1818F, -0.4397F, 1.7838F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4308F, 8.4157F, -0.1798F, 1.7853F, -0.0638F, 1.5146F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 9.9709F, -0.7907F, -0.0611F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.9606F, -0.315F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8281F, -0.7672F, -2.5566F));

		PartDefinition bone6 = hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-1.8281F, -0.7672F, -2.5566F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5081F, -3.149F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.55F, 0.8F, 3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -8.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body5 = body2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1561F, -4.2712F, 0.3884F, -0.0736F, 0.0641F));

		PartDefinition cube_r4 = body5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.2597F, -4.0894F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition body = body5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6491F, -3.79F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, 0.4F, -2.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.8F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8857F, -2.7264F, 0.3232F, -0.0414F, -0.0139F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, 0.4F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 15).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5724F, -1.3347F, 0.2967F, 0.0F, 0.0F));

		PartDefinition body6 = body3.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5086F, 0.7291F, -2.0399F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body6.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 55).addBox(-0.5F, 0.6022F, -2.7989F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 54).addBox(-0.5F, 0.6022F, -4.4989F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5086F, -0.7291F, 2.0399F, 0.3316F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5086F, 0.8908F, -1.6548F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 44).addBox(-1.3F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.999F, -1.5098F, -1.5708F, -0.3229F, 1.5708F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 52).addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.0873F, -0.8117F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 53).addBox(-0.5F, -0.2889F, 3.7677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.4F, -5.4F, 0.3229F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.6754F, 1.1368F, -1.6385F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.6754F, 1.1368F, -1.6385F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8181F, -1.4844F, -0.7101F, 0.1123F, -0.1988F, -1.6996F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3158F, 12.8557F, 6.4886F, -1.1234F, 0.5813F, -1.4189F));

		PartDefinition manus = leftarm2.addOrReplaceChild("manus", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5233F, 25.5995F, -0.4928F, -3.0869F, -0.2924F, -2.0566F));

		PartDefinition digit2 = manus.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.763F, 1.3526F, -0.7932F, 0.0873F, -0.1309F, -0.192F));

		PartDefinition digit2phalanx = digit2.addOrReplaceChild("digit2phalanx", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3281F, 24.3205F, -0.2F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition digit2phalanx2 = digit2phalanx.addOrReplaceChild("digit2phalanx2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4746F, 9.5893F, -0.1F, 0.2628F, -0.0843F, -0.0226F));

		PartDefinition digit3 = manus.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4892F, 1.1624F, -0.8099F, 0.0436F, -0.3054F, -0.5236F));

		PartDefinition digit2phalanx3 = digit3.addOrReplaceChild("digit2phalanx3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8892F, 23.3388F, -0.2F, 0.1745F, 0.0F, -0.0436F));

		PartDefinition digit2phalanx4 = digit2phalanx3.addOrReplaceChild("digit2phalanx4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7746F, 9.4893F, 0.0F, 0.264F, -0.1264F, -0.0341F));

		PartDefinition digit4 = manus.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7448F, 0.9419F, -0.5677F, 0.2053F, -0.2595F, -1.2567F));

		PartDefinition digit2phalanx5 = digit4.addOrReplaceChild("digit2phalanx5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0904F, 23.4177F, -0.5F, 0.3054F, 0.0F, -0.1309F));

		PartDefinition digit2phalanx6 = digit2phalanx5.addOrReplaceChild("digit2phalanx6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2071F, 6.3651F, 0.1F, 0.2618F, 0.0F, -0.0873F));

		PartDefinition digit = manus.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0611F, 1.3987F, -1.0F, 0.3054F, 0.0F, -0.0436F));

		PartDefinition digit5 = manus.addOrReplaceChild("digit5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0291F, 1.1126F, 0.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8181F, -1.4844F, -0.7101F, 0.121F, 0.1937F, 1.7438F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3158F, 12.8557F, 6.4886F, -1.2107F, -0.5813F, 1.4189F));

		PartDefinition manus2 = rightarm2.addOrReplaceChild("manus2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5233F, 25.5995F, -0.4928F, -3.0869F, 0.2924F, 2.0566F));

		PartDefinition digit6 = manus2.addOrReplaceChild("digit6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.763F, 1.3526F, -0.7932F, 0.1309F, 0.1309F, 0.192F));

		PartDefinition digit2phalanx7 = digit6.addOrReplaceChild("digit2phalanx7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3281F, 24.3205F, -0.2F, 0.1309F, 0.0F, 0.0436F));

		PartDefinition digit2phalanx8 = digit2phalanx7.addOrReplaceChild("digit2phalanx8", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4746F, 9.5893F, -0.1F, 0.2628F, 0.0843F, 0.0226F));

		PartDefinition digit7 = manus2.addOrReplaceChild("digit7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4892F, 1.1624F, -0.8099F, 0.0436F, 0.3054F, 0.5236F));

		PartDefinition digit2phalanx9 = digit7.addOrReplaceChild("digit2phalanx9", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8892F, 23.3388F, -0.2F, 0.1745F, 0.0F, 0.0436F));

		PartDefinition digit2phalanx10 = digit2phalanx9.addOrReplaceChild("digit2phalanx10", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7746F, 9.4893F, 0.0F, 0.264F, 0.1264F, 0.0341F));

		PartDefinition digit8 = manus2.addOrReplaceChild("digit8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7448F, 0.9419F, -0.5677F, 0.2053F, 0.2595F, 1.2567F));

		PartDefinition digit2phalanx11 = digit8.addOrReplaceChild("digit2phalanx11", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0904F, 23.4177F, -0.5F, 0.3054F, 0.0F, 0.1309F));

		PartDefinition digit2phalanx12 = digit2phalanx11.addOrReplaceChild("digit2phalanx12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2071F, 6.3651F, 0.1F, 0.2618F, 0.0F, 0.0873F));

		PartDefinition digit9 = manus2.addOrReplaceChild("digit9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0611F, 1.3987F, -1.0F, 0.3054F, 0.0F, 0.0436F));

		PartDefinition digit10 = manus2.addOrReplaceChild("digit10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0291F, 1.1126F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1368F, -1.547F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition cube_r12 = neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.8F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2301F, -0.5904F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.2F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5795F, -2.6173F, -0.5061F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5073F, -0.9312F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 34).addBox(-0.5F, 0.5069F, 3.2279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(57, 33).addBox(-0.5F, 0.5069F, 1.5279F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.7F, -1.5F, -0.9687F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6225F, -1.0348F, -0.1073F, -0.1241F, 0.0417F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 17).addBox(-0.5F, 0.5319F, -3.0721F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.7F, -0.9687F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0373F, -2.3451F, -1.3051F, -0.1911F, 0.0387F));

		PartDefinition leftCanine = head.addOrReplaceChild("leftCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7775F, 8.3824F, -5.3857F, 0.1066F, -0.1277F, -0.1554F));

		PartDefinition rightCanine = head.addOrReplaceChild("rightCanine", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7775F, 8.3824F, -5.3857F, 0.1066F, 0.1277F, 0.1554F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9168F, -0.7672F, 2.789F, 0.0F, 0.0873F, 0.0F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9168F, -0.7672F, 2.789F, 0.0F, -0.0873F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, 2.0308F, -1.0632F, 0.6632F, 0.0F, 0.0F));

		PartDefinition bone3 = jaw.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.1554F, 4.9473F, -3.5115F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 8.4308F, -3.7781F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5782F, 0.6285F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 40).addBox(-0.55F, -0.5F, -2.6F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.004F, 1.1764F, 2.2981F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}