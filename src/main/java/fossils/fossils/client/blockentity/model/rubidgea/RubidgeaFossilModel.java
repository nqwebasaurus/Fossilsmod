package fossils.fossils.client.blockentity.model.rubidgea;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RubidgeaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw1;
	private final ModelPart lowerjaw2;
	private final ModelPart lowerjaw3;
	private final ModelPart lowerjawslope;
	private final ModelPart upperjaw1;
	private final ModelPart upperjaw2;
	private final ModelPart nose;
	private final ModelPart bone6;
	private final ModelPart bone10;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart fur1;
	private final ModelPart fur2;
	private final ModelPart fur3;

	public RubidgeaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.bone2 = this.hips.getChild("bone2");
		this.bone12 = this.hips.getChild("bone12");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm6 = this.leftLeg3.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm6 = this.rightLeg3.getChild("rightArm6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyfront = this.body2.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone11 = this.chest.getChild("bone11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
		this.lowerjaw3 = this.lowerjaw2.getChild("lowerjaw3");
		this.lowerjawslope = this.lowerjaw2.getChild("lowerjawslope");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.upperjaw2 = this.upperjaw1.getChild("upperjaw2");
		this.nose = this.upperjaw2.getChild("nose");
		this.bone6 = this.nose.getChild("bone6");
		this.bone10 = this.nose.getChild("bone10");
		this.bone4 = this.upperjaw1.getChild("bone4");
		this.bone7 = this.upperjaw1.getChild("bone7");
		this.bone3 = this.head.getChild("bone3");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone8 = this.head.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.fur1 = this.body.getChild("fur1");
		this.fur2 = this.fur1.getChild("fur2");
		this.fur3 = this.fur2.getChild("fur3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1594F, 7.4916F, -0.2032F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(87, 59).addBox(0.0F, -1.0211F, -0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3249F, 2.7872F, -0.1484F, 0.0F, 0.0F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(87, 56).addBox(0.0F, -1.0137F, 0.0041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1249F, 0.7872F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-1.5F, 0.4F, 0.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 18).addBox(0.5F, 0.4F, 0.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 16).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1249F, -0.1128F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(11, 34).addBox(-0.5F, -0.559F, 0.0344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 39).addBox(0.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 39).mirror().addBox(-1.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0251F, 4.5987F, -0.3107F, 0.0F, 0.0F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(87, 53).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.559F, 2.0344F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3_r2 = tail1.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(87, 27).addBox(0.0F, 0.1488F, -0.1382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.441F, 1.1344F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(49, 72).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.459F, 0.0344F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, -0.492F, -0.0388F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0982F, 3.015F, -0.1178F, -0.1733F, 0.0204F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(43, 22).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 2.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3_r3 = tail2.addOrReplaceChild("tail3_r3", CubeListBuilder.create().texOffs(53, 68).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 0.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail2.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(80, 86).addBox(0.0F, 2.3488F, 5.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 43).addBox(0.0F, 1.7488F, 3.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5063F, -3.8902F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.6302F, 0.0376F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F))
				.texOffs(25, 88).addBox(0.0F, -0.9302F, 1.0376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, 3.8015F, -0.2501F, -0.3816F, 0.0949F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(17, 64).addBox(0.0F, 4.2488F, 11.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 27).addBox(0.0F, 3.9488F, 9.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3708F, -9.656F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hips_r4 = bone2.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(40, 76).addBox(-0.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.871F, -3.7005F, 0.4F, 0.4276F, 0.0F, 0.0F));

		PartDefinition hips_r5 = bone2.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(14, 53).addBox(-0.575F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.871F, -3.1329F, -0.3029F, 1.4333F, 0.0242F, 0.1729F));

		PartDefinition hips_r6 = bone2.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(77, 56).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.871F, -3.7005F, 0.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips_r7 = bone2.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(53, 5).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.871F, -3.8345F, -0.0841F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r8 = bone2.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(85, 6).addBox(-0.5F, -0.0596F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.871F, -4.6345F, -1.9841F, 0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r9 = bone2.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(51, 52).addBox(-0.5034F, -0.576F, -0.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, 1.1924F, -0.1514F, 0.3206F));

		PartDefinition hips_r10 = bone2.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(77, 53).addBox(-0.5F, -0.825F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5969F, -1.883F, -1.668F, 0.6021F, 0.0F, 0.1309F));

		PartDefinition hips_r11 = bone2.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(44, 52).addBox(-0.3218F, -0.3984F, 0.3392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.6458F, 0.0F, 0.3491F));

		PartDefinition hips_r12 = bone2.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(43, 47).addBox(-0.725F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4792F, -0.7955F, 0.0516F, 0.0012F, -0.0226F, 0.2468F));

		PartDefinition hips_r13 = bone2.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(68, 34).addBox(-0.4758F, -0.3551F, -0.2705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, -0.896F, -0.1451F, 0.3186F));

		PartDefinition hips_r14 = bone2.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(77, 50).addBox(-0.4758F, -0.2672F, -0.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, 0.5003F, -0.1451F, 0.3186F));

		PartDefinition hips_r15 = bone2.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(77, 29).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0899F, -0.0563F, 0.0954F, 0.2618F, 0.0F, 0.3491F));

		PartDefinition hips_r16 = bone2.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(77, 26).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3027F, -1.1349F, 1.3091F, 0.8306F, 0.0594F, 0.3442F));

		PartDefinition hips_r17 = bone2.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(52, 14).addBox(-0.775F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6134F, -1.1642F, 0.0233F, 1.2143F, -0.0305F, 0.2673F));

		PartDefinition hips_r18 = bone2.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(47, 36).addBox(-0.183F, -4.1407F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, 0.1309F));

		PartDefinition bone12 = hips.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hips_r19 = bone12.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.7005F, 0.4F, 0.4276F, 0.0F, 0.0F));

		PartDefinition hips_r20 = bone12.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.425F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.1329F, -0.3029F, 1.4333F, -0.0242F, -0.1729F));

		PartDefinition hips_r21 = bone12.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.7005F, 0.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips_r22 = bone12.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(53, 5).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.8345F, -0.0841F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r23 = bone12.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(85, 6).mirror().addBox(-0.5F, -0.0596F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -4.6345F, -1.9841F, 0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r24 = bone12.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(51, 52).mirror().addBox(-0.4965F, -0.576F, -0.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, 1.1924F, 0.1514F, -0.3206F));

		PartDefinition hips_r25 = bone12.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(77, 53).mirror().addBox(-0.5F, -0.825F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5969F, -1.883F, -1.668F, 0.6021F, 0.0F, -0.1309F));

		PartDefinition hips_r26 = bone12.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.6782F, -0.3984F, 0.3392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.6458F, 0.0F, -0.3491F));

		PartDefinition hips_r27 = bone12.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-0.275F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4792F, -0.7955F, 0.0516F, 0.0012F, 0.0226F, -0.2468F));

		PartDefinition hips_r28 = bone12.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(-0.5242F, -0.3551F, -0.2705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, -0.896F, 0.1451F, -0.3186F));

		PartDefinition hips_r29 = bone12.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-0.5242F, -0.2672F, -0.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, 0.5003F, 0.1451F, -0.3186F));

		PartDefinition hips_r30 = bone12.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(77, 29).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0899F, -0.0563F, 0.0954F, 0.2618F, 0.0F, -0.3491F));

		PartDefinition hips_r31 = bone12.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, -1.1349F, 1.3091F, 0.8306F, -0.0594F, -0.3442F));

		PartDefinition hips_r32 = bone12.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-0.225F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -1.1642F, 0.0233F, 1.2143F, 0.0305F, -0.2673F));

		PartDefinition hips_r33 = bone12.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(47, 36).mirror().addBox(-0.817F, -4.1407F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, -0.1309F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.3207F, 2.7902F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.8421F, -0.4258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 61).addBox(-1.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.1768F, 0.243F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 40).addBox(-1.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 0.0232F, -0.357F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 61).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.2575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 68).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -0.9575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 60).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, 0.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 23).addBox(-1.0F, -1.8674F, 1.493F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.6003F, -0.8503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 31).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.2404F, -1.2985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4714F, -1.0835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 67).addBox(-0.5F, 0.242F, -0.2153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.6652F, -1.5822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(68, 38).addBox(-0.5F, -1.9224F, -0.7835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.2575F, -1.1162F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(10, 69).addBox(0.3F, 0.0509F, 0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 34).addBox(-1.3F, 0.0072F, -0.7522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(66, 12).addBox(-1.3F, 0.0072F, -1.1522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.0604F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(33, 61).addBox(-1.3F, -0.125F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3255F, 0.8396F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8F, 2.5187F, 0.4635F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(66, 9).addBox(-1.0F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 4.3096F, -0.5707F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 35).addBox(-1.4F, -1.8877F, -0.9982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.9719F, 0.1839F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 32).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.8F, 4.3259F, -0.0048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(78, 14).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.8F, 4.4673F, -0.2497F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 11).addBox(-0.3F, -0.2718F, 0.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.0409F, -0.9594F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(49, 75).addBox(-0.5F, 0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.8F, 0.5824F, -0.4332F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(77, 68).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.8F, 0.8976F, 0.9171F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(77, 65).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8F, 0.4364F, 0.814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 68).addBox(-1.4F, -2.1718F, -0.0792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 4.0409F, -0.9594F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 0).addBox(-1.5F, -1.1F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, 0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.8284F, 1.4019F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftArm6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(27, 41).addBox(-0.9616F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.3207F, 2.7902F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 83).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.8421F, -0.4258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(65, 29).addBox(-0.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.1768F, 0.243F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 44).addBox(-0.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 0.0232F, -0.357F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 26).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.2575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(68, 72).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -0.9575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 4).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, 0.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(64, 63).addBox(-1.0F, -1.8674F, 1.493F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.6003F, -0.8503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 48).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.2404F, -1.2985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4714F, -1.0835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, 0.242F, -0.2153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.6652F, -1.5822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 66).addBox(-0.5F, -1.9224F, -0.7835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.2575F, -1.1162F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(5, 73).addBox(-1.3F, 0.0509F, 0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(50, 65).addBox(-0.7F, 0.0072F, -0.7522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(26, 66).addBox(-0.7F, 0.0072F, -1.1522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.0604F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(43, 65).addBox(-0.7F, -0.125F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.3255F, 0.8396F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(38, 65).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8F, 2.5187F, 0.4635F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(66, 15).addBox(-1.0F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.3096F, -0.5707F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(80, 83).addBox(0.4F, -1.8877F, -0.9982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, 2.9719F, 0.1839F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(83, 71).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.8F, 4.3259F, -0.0048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(83, 36).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.8F, 4.4673F, -0.2497F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(83, 33).addBox(-0.7F, -0.2718F, 0.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.0409F, -0.9594F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, 0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.8F, 0.5824F, -0.4332F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 30).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.8F, 0.8976F, 0.9171F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.8F, 0.4364F, 0.814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 73).addBox(0.4F, -2.1718F, -0.0792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 4.0409F, -0.9594F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(27, 45).addBox(-1.5F, -1.1F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, 0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.8284F, 1.4019F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightArm6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 43).addBox(-2.0384F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(88, 14).addBox(0.0F, -1.0065F, -0.0226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, -0.8658F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(88, 11).addBox(0.0F, -1.3309F, -0.8501F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2687F, -2.0658F, -0.192F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(45, 87).addBox(0.0F, -1.1164F, -0.1021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.7658F, -0.1833F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, -2.0523F, 0.3675F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1313F, -4.0658F, 0.5498F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(13, 23).addBox(-0.5F, -0.1269F, -0.0027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.8658F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.1218F, 0.0123F, -0.7501F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(-2.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.0566F, 0.0705F, -1.2921F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 42).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.2464F, 0.0525F, -0.6588F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(17, 67).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.1435F, 0.1689F, -1.1944F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.203F, 0.2339F, -1.0778F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-3.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.0566F, 0.3034F, -1.6166F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.3298F, 0.0789F, -0.5486F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(15, 69).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.1218F, -0.0123F, 0.7501F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 19).addBox(1.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.0566F, -0.0705F, 1.2921F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 42).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.2464F, -0.0525F, 0.6588F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(17, 67).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.1435F, -0.1689F, 1.1944F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 32).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.203F, -0.2339F, 1.0778F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 4).addBox(2.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.0566F, -0.3034F, 1.6166F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(67, 24).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.3298F, -0.0789F, 0.5486F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5687F, -4.8658F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(86, 86).addBox(0.0F, -1.1375F, -0.1825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -3.6F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(83, 86).addBox(0.0F, -1.1675F, 0.11F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body_r8 = body2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(86, 39).addBox(0.0F, -0.9978F, -0.1219F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -7.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-4.5794F, -2.5744F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.0752F, 0.3889F, -1.558F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 22).mirror().addBox(-3.5211F, -0.9398F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.2643F, 0.298F, -1.0093F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 7).mirror().addBox(-1.7884F, -0.0168F, -0.5105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.4135F, 0.1047F, -0.4885F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 5).mirror().addBox(-1.6006F, 0.0541F, -0.5201F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.4135F, 0.1047F, -0.4187F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 3).mirror().addBox(-3.3972F, -0.7816F, -0.5481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.2643F, 0.298F, -0.9395F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-5.5513F, -2.3755F, -0.5481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.0752F, 0.3889F, -1.4882F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(29, 69).mirror().addBox(-1.5949F, 0.0412F, -0.5171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.4323F, 0.1041F, -0.3816F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(22, 69).mirror().addBox(-3.3856F, -0.7897F, -0.5455F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.2817F, 0.3068F, -0.8991F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(36, 41).mirror().addBox(-6.5371F, -2.3767F, -0.5455F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.0855F, 0.405F, -1.449F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-1.5877F, 0.024F, -0.5075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.4316F, 0.1058F, -0.3292F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-3.3705F, -0.8011F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.2802F, 0.3079F, -0.8472F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(41, 4).mirror().addBox(-6.5184F, -2.379F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.0836F, 0.4052F, -1.3974F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(73, 0).addBox(2.5795F, -2.5744F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.0752F, -0.3889F, 1.558F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 22).addBox(1.5211F, -0.9398F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.2643F, -0.298F, 1.0093F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(70, 7).addBox(-0.2116F, -0.0168F, -0.5105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.4135F, -0.1047F, 0.4885F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 5).addBox(-0.3994F, 0.0541F, -0.5201F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.4135F, -0.1047F, 0.4187F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 3).addBox(1.3972F, -0.7816F, -0.5481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.2643F, -0.298F, 0.9395F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(47, 41).addBox(2.5513F, -2.3755F, -0.5481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.0752F, -0.3889F, 1.4882F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(29, 69).addBox(-0.4052F, 0.0412F, -0.5171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.4323F, -0.1041F, 0.3816F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(22, 69).addBox(1.3856F, -0.7897F, -0.5455F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.2817F, -0.3068F, 0.8991F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 41).addBox(2.5371F, -2.3767F, -0.5455F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.0855F, -0.405F, 1.449F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(69, 20).addBox(-0.4123F, 0.024F, -0.5075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.4316F, -0.1058F, 0.3292F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(69, 18).addBox(1.3705F, -0.8011F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.2802F, -0.3079F, 0.8472F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(41, 4).addBox(2.5184F, -2.379F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.0836F, -0.4052F, 1.3974F));

		PartDefinition body_r9 = body2.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, -0.0286F, -6.0567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body_r10 = body2.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(87, 62).addBox(0.0F, -1.2617F, -0.0047F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body_r11 = body2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.3336F, -4.9569F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.85F, 0.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body_r12 = body2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(20, 35).addBox(-0.5F, -0.2792F, -0.0049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront = body2.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7045F, -8.8635F, 0.1416F, 0.0432F, 0.0062F));

		PartDefinition Front_r1 = bodyfront.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.925F, -0.5F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0455F, 5.7872F, -3.776F, -2.1364F, -0.937F, 2.2381F));

		PartDefinition Front_r2 = bodyfront.addOrReplaceChild("Front_r2", CubeListBuilder.create().texOffs(65, 57).mirror().addBox(-0.7F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.506F, 5.0506F, -5.0518F, -1.2121F, -1.0075F, 1.1535F));

		PartDefinition Front_r3 = bodyfront.addOrReplaceChild("Front_r3", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-3.6484F, 0.2619F, -0.6624F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0445F, -3.0647F, -0.3212F, 0.2477F, 0.4397F));

		PartDefinition Front_r4 = bodyfront.addOrReplaceChild("Front_r4", CubeListBuilder.create().texOffs(26, 23).mirror().addBox(-6.8271F, -0.175F, -0.182F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1445F, 2.4353F, 0.1755F, 1.048F, 0.6716F));

		PartDefinition Front_r5 = bodyfront.addOrReplaceChild("Front_r5", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-5.6916F, -0.2697F, -0.0601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1445F, 2.4353F, -0.0183F, 0.9202F, 0.4906F));

		PartDefinition Front_r6 = bodyfront.addOrReplaceChild("Front_r6", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(-3.6547F, -0.0476F, -0.1366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.9445F, 2.0353F, -0.1508F, 0.1509F, 0.2393F));

		PartDefinition Front_r7 = bodyfront.addOrReplaceChild("Front_r7", CubeListBuilder.create().texOffs(30, 14).mirror().addBox(-3.8638F, -0.2188F, -0.4566F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.9445F, 0.2353F, -0.4378F, 0.1865F, 0.4293F));

		PartDefinition Front_r8 = bodyfront.addOrReplaceChild("Front_r8", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-3.9408F, -0.2754F, -0.4857F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8445F, -1.6647F, -0.4547F, 0.2452F, 0.388F));

		PartDefinition cube_r91 = bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-4.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.0797F, 0.4147F, -1.4341F));

		PartDefinition cube_r92 = bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(22, 71).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.2822F, 0.3179F, -0.8817F));

		PartDefinition cube_r93 = bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.4383F, 0.1135F, -0.3637F));

		PartDefinition cube_r94 = bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-1.5836F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.3549F, 0.0867F, -0.3021F));

		PartDefinition cube_r95 = bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-3.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.2212F, 0.2532F, -0.829F));

		PartDefinition cube_r96 = bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 21).mirror().addBox(-5.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.062F, 0.3291F, -1.3706F));

		PartDefinition cube_r97 = bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(62, 70).mirror().addBox(-1.5836F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r98 = bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(-3.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r99 = bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(53, 9).mirror().addBox(-5.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.0407F, 0.2264F, -1.3765F));

		PartDefinition Front_r9 = bodyfront.addOrReplaceChild("Front_r9", CubeListBuilder.create().texOffs(55, 82).addBox(-0.075F, -0.5F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0455F, 5.7872F, -3.776F, -2.1364F, 0.937F, -2.2381F));

		PartDefinition Front_r10 = bodyfront.addOrReplaceChild("Front_r10", CubeListBuilder.create().texOffs(65, 57).addBox(-1.3F, -0.5F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.506F, 5.0506F, -5.0518F, -1.2121F, 1.0075F, -1.1535F));

		PartDefinition Front_r11 = bodyfront.addOrReplaceChild("Front_r11", CubeListBuilder.create().texOffs(65, 54).addBox(-1.0F, -2.7529F, -3.1641F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(43, 14).addBox(-1.0F, -2.7529F, -0.1641F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(7, 57).addBox(-0.5F, -2.7529F, -2.1641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.7979F, -4.799F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Front_r12 = bodyfront.addOrReplaceChild("Front_r12", CubeListBuilder.create().texOffs(43, 12).addBox(-0.3516F, 0.2619F, -0.6624F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0445F, -3.0647F, -0.3212F, -0.2477F, -0.4397F));

		PartDefinition Front_r13 = bodyfront.addOrReplaceChild("Front_r13", CubeListBuilder.create().texOffs(26, 23).addBox(-0.1729F, -0.175F, -0.182F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.1445F, 2.4353F, 0.1755F, -1.048F, -0.6716F));

		PartDefinition Front_r14 = bodyfront.addOrReplaceChild("Front_r14", CubeListBuilder.create().texOffs(28, 16).addBox(-0.3084F, -0.2697F, -0.0601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.1445F, 2.4353F, -0.0183F, -0.9202F, -0.4906F));

		PartDefinition Front_r15 = bodyfront.addOrReplaceChild("Front_r15", CubeListBuilder.create().texOffs(42, 34).addBox(-0.3453F, -0.0476F, -0.1366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9445F, 2.0353F, -0.1508F, -0.1509F, -0.2393F));

		PartDefinition Front_r16 = bodyfront.addOrReplaceChild("Front_r16", CubeListBuilder.create().texOffs(30, 14).addBox(-1.1362F, -0.2188F, -0.4566F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9445F, 0.2353F, -0.4378F, -0.1865F, -0.4293F));

		PartDefinition Front_r17 = bodyfront.addOrReplaceChild("Front_r17", CubeListBuilder.create().texOffs(30, 12).addBox(-1.0592F, -0.2754F, -0.4857F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8445F, -1.6647F, -0.4547F, -0.2452F, -0.388F));

		PartDefinition Front_r18 = bodyfront.addOrReplaceChild("Front_r18", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.9547F, -0.0884F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.0979F, -2.224F, -0.0829F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(87, 23).addBox(0.0F, -1.6449F, -0.3761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 49).addBox(0.0F, -2.0449F, 1.6239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4485F, -2.4107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(87, 0).addBox(0.0F, -1.616F, -0.1669F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, -4.7107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r3 = bodyfront.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.9385F, 1.0114F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2485F, -5.7107F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(73, 9).addBox(2.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.0797F, -0.4147F, 1.4341F));

		PartDefinition cube_r101 = bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(22, 71).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.2822F, -0.3179F, 0.8817F));

		PartDefinition cube_r102 = bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 71).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.4383F, -0.1135F, 0.3637F));

		PartDefinition cube_r103 = bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 71).addBox(-0.4164F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.3549F, -0.0867F, 0.3021F));

		PartDefinition cube_r104 = bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(69, 70).addBox(1.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.2212F, -0.2532F, 0.829F));

		PartDefinition cube_r105 = bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(53, 21).addBox(2.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.062F, -0.3291F, 1.3706F));

		PartDefinition cube_r106 = bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(62, 70).addBox(-0.4164F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r107 = bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(36, 70).addBox(1.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r108 = bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 9).addBox(2.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.0407F, -0.2264F, 1.3765F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5485F, -4.7107F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(87, 65).addBox(0.0F, -1.1812F, -0.1076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(86, 47).mirror().addBox(-3.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.102F, 0.6573F, -1.546F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.4447F, 0.5107F, -0.9393F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.6645F, 0.2106F, -0.4505F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(86, 47).addBox(2.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.102F, -0.6573F, 1.546F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(71, 48).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.4447F, -0.5107F, 0.9393F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(85, 9).addBox(0.9641F, -0.1102F, -0.4897F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.6645F, -0.2106F, 0.4505F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(53, 23).addBox(-0.5F, -1.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bodyfront_r6 = bone.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.525F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1109F, 1.8659F, -1.6405F, -1.3854F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r7 = bone.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(79, 21).addBox(-0.4674F, -1.0526F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.1729F, 1.3093F, -1.3807F, -1.4291F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r8 = bone.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0323F, 1.5316F, -0.907F, -0.8182F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r9 = bone.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(45, 78).addBox(-0.5174F, -0.1639F, -1.6861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(78, 38).addBox(-0.4674F, -1.1139F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1729F, 1.3093F, -1.3807F, -1.1673F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r10 = bone.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(0, 62).addBox(-0.6515F, -3.0168F, -1.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.1353F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r11 = bone.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(29, 36).addBox(-0.6515F, -1.2134F, -0.2032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1039F, 0.2478F, -0.4962F));

		PartDefinition Front_r19 = bone.addOrReplaceChild("Front_r19", CubeListBuilder.create().texOffs(46, 27).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9002F, -0.4537F, -2.9818F, -0.4339F, -0.8238F, -1.2786F));

		PartDefinition Front_r20 = bone.addOrReplaceChild("Front_r20", CubeListBuilder.create().texOffs(61, 42).addBox(0.134F, -2.637F, -0.9454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6748F, 2.8925F, -4.7716F, -0.7018F, 0.0074F, -1.0666F));

		PartDefinition bodyfront_r12 = bone.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.8173F, -3.3096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r13 = bone.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(29, 71).addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.209F, 2.013F, -2.3518F, 1.3082F, 0.2037F, -0.1755F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bodyfront_r14 = bone11.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5F, -0.525F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1109F, 1.8659F, -1.6405F, -1.3854F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r15 = bone11.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.5326F, -1.0526F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 1.3093F, -1.3807F, -1.4291F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r16 = bone11.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-0.5F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0323F, 1.5316F, -0.907F, -0.8182F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r17 = bone11.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.4826F, -0.1639F, -1.6861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(78, 38).mirror().addBox(-0.5326F, -1.1139F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 1.3093F, -1.3807F, -1.1673F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r18 = bone11.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.3485F, -3.0168F, -1.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.1353F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r19 = bone11.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(29, 36).mirror().addBox(-0.3485F, -1.2134F, -0.2032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1039F, -0.2478F, 0.4962F));

		PartDefinition Front_r21 = bone11.addOrReplaceChild("Front_r21", CubeListBuilder.create().texOffs(46, 27).mirror().addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9002F, -0.4537F, -2.9818F, -0.4339F, 0.8238F, 1.2786F));

		PartDefinition Front_r22 = bone11.addOrReplaceChild("Front_r22", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-2.134F, -2.637F, -0.9454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6748F, 2.8925F, -4.7716F, -0.7018F, -0.0074F, 1.0666F));

		PartDefinition bodyfront_r20 = bone11.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5F, -1.8173F, -3.3096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r21 = bone11.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(29, 71).mirror().addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.209F, 2.013F, -2.3518F, 1.3082F, -0.2037F, 0.1755F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4322F, 3.6415F, 1.3217F, -0.0015F, -0.009F, -0.0068F));

		PartDefinition cube_r115 = leftarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 19).addBox(-1.0013F, 0.4358F, -0.6685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.2325F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(65, 60).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.2207F, 1.5216F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftarm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(50, 79).addBox(0.5008F, 0.9003F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0118F, -1.2961F, 0.0756F, -0.6895F, 0.0014F, -0.001F));

		PartDefinition cube_r118 = leftarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(71, 44).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0097F, 0.168F, 0.0161F, -0.5149F, 0.0012F, 0.0008F));

		PartDefinition cube_r119 = leftarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(63, 37).addBox(-0.0047F, -1.0439F, -0.1015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 3.9673F, 0.1378F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(40, 79).addBox(-0.4992F, -0.0295F, -0.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 1.8347F, -1.4751F, 1.0689F, 0.0014F, -0.001F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5005F, -0.0815F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0098F, 0.9347F, -1.7751F, 0.2835F, 0.0014F, -0.001F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 0.3597F, -1.0001F, -0.3055F, 0.0014F, -0.001F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(25, 79).addBox(-0.5013F, -0.4359F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.1325F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(76, 18).addBox(-0.5013F, -1.162F, -0.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.1325F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(21, 62).addBox(0.0F, -2.8961F, -1.0564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.6885F, 1.1014F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.522F, 1.3834F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftarm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(65, 79).addBox(-0.5378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.8461F, 1.1201F, 1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r127 = leftarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(54, 76).addBox(0.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(76, 45).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r128 = leftarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(72, 26).addBox(-1.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r129 = leftarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(42, 60).addBox(-0.3985F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1764F, 1.5704F, -0.4664F, 1.5708F, -1.4486F, -1.6232F));

		PartDefinition cube_r130 = leftarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(53, 71).addBox(-0.675F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, 1.5708F, -1.1694F, -1.6232F));

		PartDefinition cube_r131 = leftarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(60, 79).addBox(-0.775F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(55, 79).addBox(-0.775F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, -1.5708F, -1.1868F, 1.5184F));

		PartDefinition cube_r132 = leftarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(73, 11).addBox(-0.0572F, -0.0033F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 3.9496F, 0.3519F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftArm3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(21, 54).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 1.8658F, 0.2065F, 0.0349F, -0.0002F, 0.0001F));

		PartDefinition cube_r134 = leftArm4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(42, 30).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftArm5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 30).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4322F, 3.6415F, 1.3217F, 0.6094F, 0.009F, 0.0068F));

		PartDefinition cube_r136 = rightarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 45).addBox(-0.9987F, 0.4358F, -0.6685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.2325F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(66, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.2207F, 1.5216F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 83).addBox(-1.5008F, 0.9003F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0118F, -1.2961F, 0.0756F, -0.6895F, -0.0014F, 0.001F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(72, 58).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0097F, 0.168F, 0.0161F, -0.5149F, -0.0012F, -0.0008F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(33, 64).addBox(-0.9953F, -1.0439F, -0.1015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 3.9673F, 0.1378F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r141 = rightarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 82).addBox(-0.5008F, -0.0295F, -0.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 1.8347F, -1.4751F, 1.0689F, -0.0014F, 0.001F));

		PartDefinition cube_r142 = rightarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 82).addBox(-0.4995F, -0.0815F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0098F, 0.9347F, -1.7751F, 0.2835F, -0.0014F, 0.001F));

		PartDefinition cube_r143 = rightarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(82, 68).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 0.3597F, -1.0001F, -0.3055F, -0.0014F, 0.001F));

		PartDefinition cube_r144 = rightarm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(82, 65).addBox(-0.4987F, -0.4359F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.1325F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightarm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(30, 76).addBox(-0.4987F, -1.162F, -0.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.1325F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightarm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(12, 64).addBox(-1.0F, -2.8961F, -1.0564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.6885F, 1.1014F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.522F, 1.3834F, -1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(83, 11).addBox(-0.4622F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.8461F, 1.1201F, 1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r148 = rightarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(20, 77).addBox(-1.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(15, 77).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r149 = rightarm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 72).addBox(0.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r150 = rightarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(47, 60).addBox(-0.6015F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1764F, 1.5704F, -0.4664F, 1.5708F, 1.4486F, 1.6232F));

		PartDefinition cube_r151 = rightarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(72, 62).addBox(-0.325F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, 1.5708F, 1.1694F, 1.6232F));

		PartDefinition cube_r152 = rightarm2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 83).addBox(-0.225F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(5, 83).addBox(-0.225F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, -1.5708F, 1.1868F, -1.5184F));

		PartDefinition cube_r153 = rightarm2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(15, 73).addBox(-0.9428F, -0.0033F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 3.9496F, 0.3519F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r154 = rightArm3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(35, 57).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 1.8658F, 0.2065F, 1.6493F, 0.0002F, -0.0001F));

		PartDefinition cube_r155 = rightArm4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(36, 43).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r156 = rightArm5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(22, 31).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(57, 47).addBox(-0.5F, -0.5784F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0618F, -1.8993F, -0.0957F, 0.2607F, -0.0247F));

		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(87, 68).addBox(0.0F, -1.0612F, -0.0227F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4784F, -1.9889F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4216F, -1.9889F, -0.6566F, -0.3703F, 0.2357F));

		PartDefinition neck_r3 = neck.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(16, 48).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4216F, -1.9889F, -0.6566F, 0.3703F, -0.2357F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1912F, -2.0238F, -0.1325F, 0.285F, 0.1325F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 4).addBox(0.0F, -1.7183F, -0.1365F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck_r4 = neck4.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(73, 34).mirror().addBox(-0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -1.6F, -0.4891F, -0.2604F, 0.144F));

		PartDefinition neck_r5 = neck4.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(73, 34).addBox(0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.6F, -0.4891F, 0.2604F, -0.144F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.375F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.0707F, -4.0544F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.6481F, -3.5617F, 0.1794F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(28, 18).addBox(-1.5F, 0.0168F, 0.0273F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5079F, -2.9878F, 0.1178F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(7, 52).addBox(-0.5F, 0.2407F, -1.3258F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7377F, -2.9899F, 0.0829F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(72, 50).addBox(-0.5F, -0.7F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7159F, -0.5011F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(65, 51).addBox(-1.0F, -0.5875F, -0.833F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.1778F, -0.7265F, 0.1396F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(82, 27).addBox(-0.5F, -0.8907F, -0.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 18).addBox(-1.5F, -0.5907F, -0.1679F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.1778F, -0.7265F, -0.384F, 0.0F, 0.0F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.754F, 1.2185F, 0.776F, 0.0F, 0.0F));

		PartDefinition lowerjaw6_r1 = lowerjaw1.addOrReplaceChild("lowerjaw6_r1", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8467F, 1.081F, -1.4228F, 1.0572F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r1 = lowerjaw1.addOrReplaceChild("lowerjaw5_r1", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-0.4015F, 0.6811F, -1.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, -0.0598F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r1 = lowerjaw1.addOrReplaceChild("lowerjaw4_r1", CubeListBuilder.create().texOffs(81, 44).mirror().addBox(-0.4015F, 0.0109F, -1.3094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.8565F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r2 = lowerjaw1.addOrReplaceChild("lowerjaw5_r2", CubeListBuilder.create().texOffs(81, 41).mirror().addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7099F, 1.4792F, -1.8511F, -1.011F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r3 = lowerjaw1.addOrReplaceChild("lowerjaw5_r3", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-0.4015F, 0.0766F, -4.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.298F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r2 = lowerjaw1.addOrReplaceChild("lowerjaw4_r2", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.4015F, 0.6681F, -3.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.1234F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r3 = lowerjaw1.addOrReplaceChild("lowerjaw4_r3", CubeListBuilder.create().texOffs(72, 30).mirror().addBox(-0.5F, -1.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0012F)).mirror(false), PartPose.offsetAndRotation(-2.6748F, 1.6923F, -1.9519F, 0.106F, -0.2886F, -0.024F));

		PartDefinition lowerjaw2_r1 = lowerjaw1.addOrReplaceChild("lowerjaw2_r1", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-0.5F, -0.625F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9571F, 0.9566F, -1.0612F, -0.1471F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r4 = lowerjaw1.addOrReplaceChild("lowerjaw5_r4", CubeListBuilder.create().texOffs(81, 47).addBox(-0.5F, -0.55F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.0467F, 1.081F, -1.4228F, 1.0572F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r4 = lowerjaw1.addOrReplaceChild("lowerjaw4_r4", CubeListBuilder.create().texOffs(45, 81).addBox(-0.5985F, 0.6811F, -1.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, -0.0598F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r1 = lowerjaw1.addOrReplaceChild("lowerjaw3_r1", CubeListBuilder.create().texOffs(81, 44).addBox(-0.5985F, 0.0109F, -1.3094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.8565F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r5 = lowerjaw1.addOrReplaceChild("lowerjaw4_r5", CubeListBuilder.create().texOffs(81, 41).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9099F, 1.4792F, -1.8511F, -1.011F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r6 = lowerjaw1.addOrReplaceChild("lowerjaw4_r6", CubeListBuilder.create().texOffs(81, 17).addBox(-0.5985F, 0.0766F, -4.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.298F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r2 = lowerjaw1.addOrReplaceChild("lowerjaw3_r2", CubeListBuilder.create().texOffs(80, 80).addBox(-0.5985F, 0.6681F, -3.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.1234F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r3 = lowerjaw1.addOrReplaceChild("lowerjaw3_r3", CubeListBuilder.create().texOffs(72, 30).addBox(-0.5F, -1.5F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.0012F)), PartPose.offsetAndRotation(0.8748F, 1.6923F, -1.9519F, 0.106F, 0.2886F, 0.024F));

		PartDefinition lowerjaw1_r1 = lowerjaw1.addOrReplaceChild("lowerjaw1_r1", CubeListBuilder.create().texOffs(80, 77).addBox(-0.5F, -0.625F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1571F, 0.9566F, -1.0612F, -0.1471F, 0.2886F, 0.024F));

		PartDefinition lowerjaw2 = lowerjaw1.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.16F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw5_r5 = lowerjaw2.addOrReplaceChild("lowerjaw5_r5", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.875F, -0.175F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-2.1244F, 1.6302F, 1.3996F, 0.5645F, -0.515F, -0.1378F));

		PartDefinition lowerjaw8_r1 = lowerjaw2.addOrReplaceChild("lowerjaw8_r1", CubeListBuilder.create().texOffs(82, 53).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5577F, 1.6944F, -0.5044F, 0.0535F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw7_r1 = lowerjaw2.addOrReplaceChild("lowerjaw7_r1", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-0.5F, -1.075F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6691F, 2.8316F, -0.1577F, 0.0098F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw7_r2 = lowerjaw2.addOrReplaceChild("lowerjaw7_r2", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.5F, -0.2235F, -0.4909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4177F, 1.9773F, -1.0599F, 0.0019F, -0.1848F, 0.007F));

		PartDefinition lowerjaw6_r2 = lowerjaw2.addOrReplaceChild("lowerjaw6_r2", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.6015F, -1.3519F, -2.6281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(30, 82).mirror().addBox(-0.6015F, -1.3519F, -2.9281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.4592F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw6_r3 = lowerjaw2.addOrReplaceChild("lowerjaw6_r3", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.7704F, -0.1028F, 2.9089F, 1.201F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw4_r7 = lowerjaw2.addOrReplaceChild("lowerjaw4_r7", CubeListBuilder.create().texOffs(56, 38).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9232F, 1.7968F, 0.7201F, 0.5072F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw6_r4 = lowerjaw2.addOrReplaceChild("lowerjaw6_r4", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7655F, 2.2181F, 0.1805F, 0.2629F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw4_r8 = lowerjaw2.addOrReplaceChild("lowerjaw4_r8", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.5F, -0.7514F, -0.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4177F, 1.9773F, -1.0599F, -0.0112F, -0.1848F, 0.007F));

		PartDefinition lowerjaw4_r9 = lowerjaw2.addOrReplaceChild("lowerjaw4_r9", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-0.4015F, 0.0481F, -1.8781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.5328F, -0.2483F, 2.4705F, 0.5814F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw3_r4 = lowerjaw2.addOrReplaceChild("lowerjaw3_r4", CubeListBuilder.create().texOffs(54, 34).mirror().addBox(-0.4015F, -0.572F, -6.2912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.372F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw4_r10 = lowerjaw2.addOrReplaceChild("lowerjaw4_r10", CubeListBuilder.create().texOffs(28, 57).addBox(-0.125F, -0.175F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3245F, 1.6302F, 1.3996F, 0.5645F, 0.515F, 0.1378F));

		PartDefinition lowerjaw3_r5 = lowerjaw2.addOrReplaceChild("lowerjaw3_r5", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1232F, 1.7968F, 0.7201F, 0.5072F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw6_r5 = lowerjaw2.addOrReplaceChild("lowerjaw6_r5", CubeListBuilder.create().texOffs(10, 77).addBox(-0.5F, -0.2235F, -0.4909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3823F, 1.9773F, -1.0599F, 0.0019F, 0.1848F, -0.007F));

		PartDefinition lowerjaw7_r3 = lowerjaw2.addOrReplaceChild("lowerjaw7_r3", CubeListBuilder.create().texOffs(82, 53).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2423F, 1.6944F, -0.5044F, 0.0535F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw6_r6 = lowerjaw2.addOrReplaceChild("lowerjaw6_r6", CubeListBuilder.create().texOffs(82, 50).addBox(-0.5F, -1.075F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1309F, 2.8316F, -0.1577F, 0.0098F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw5_r6 = lowerjaw2.addOrReplaceChild("lowerjaw5_r6", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0345F, 2.2181F, 0.1805F, 0.2629F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3_r6 = lowerjaw2.addOrReplaceChild("lowerjaw3_r6", CubeListBuilder.create().texOffs(15, 80).addBox(-0.5F, -0.7514F, -0.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3823F, 1.9773F, -1.0599F, -0.0112F, 0.1848F, -0.007F));

		PartDefinition lowerjaw5_r7 = lowerjaw2.addOrReplaceChild("lowerjaw5_r7", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9704F, -0.1028F, 2.9089F, 1.201F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw5_r8 = lowerjaw2.addOrReplaceChild("lowerjaw5_r8", CubeListBuilder.create().texOffs(40, 82).addBox(-0.3985F, -1.3519F, -2.6281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F))
				.texOffs(30, 82).addBox(-0.3985F, -1.3519F, -2.9281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.4592F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3_r7 = lowerjaw2.addOrReplaceChild("lowerjaw3_r7", CubeListBuilder.create().texOffs(54, 43).addBox(-0.5985F, 0.0481F, -1.8781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7328F, -0.2483F, 2.4705F, 0.5814F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw2_r2 = lowerjaw2.addOrReplaceChild("lowerjaw2_r2", CubeListBuilder.create().texOffs(54, 34).addBox(-0.5985F, -0.572F, -6.2912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.372F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3 = lowerjaw2.addOrReplaceChild("lowerjaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r159 = lowerjaw3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0578F, 1.0087F, 2.0242F, 0.6948F, 0.0253F, -0.0412F));

		PartDefinition lowerjaw5_r9 = lowerjaw3.addOrReplaceChild("lowerjaw5_r9", CubeListBuilder.create().texOffs(5, 64).mirror().addBox(-0.8F, -0.3238F, -0.1876F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2191F, 0.8102F, 2.8205F, -1.6271F, -0.0096F, -0.013F));

		PartDefinition cube_r160 = lowerjaw3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-0.1985F, 0.5241F, -1.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 3.0425F, 0.0189F, -0.0752F, 2.9653F));

		PartDefinition cube_r161 = lowerjaw3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.1483F, 0.354F, -1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 3.0425F, -0.2958F, -0.0336F, 2.9488F));

		PartDefinition cube_r162 = lowerjaw3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.1483F, -0.1105F, -1.0069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 3.0425F, -0.3831F, -0.0336F, 2.9488F));

		PartDefinition cube_r163 = lowerjaw3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(75, 79).mirror().addBox(-0.1483F, 0.2746F, -1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 74).mirror().addBox(-0.1483F, -0.2254F, -1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 3.0425F, -0.2086F, -0.0336F, 2.9488F));

		PartDefinition lowerjaw5_r10 = lowerjaw3.addOrReplaceChild("lowerjaw5_r10", CubeListBuilder.create().texOffs(70, 79).mirror().addBox(-0.5048F, -0.4961F, -0.8741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3311F, 1.3508F, 3.248F, -0.065F, -0.0096F, -0.013F));

		PartDefinition lowerjaw4_r11 = lowerjaw3.addOrReplaceChild("lowerjaw4_r11", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-0.8F, 0.0643F, -0.5281F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2175F, 0.8728F, 2.7425F, -0.8941F, -0.0096F, -0.013F));

		PartDefinition cube_r164 = lowerjaw3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(80, 8).addBox(-0.8015F, 0.5241F, -1.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 3.0425F, 0.0189F, 0.0752F, -2.9653F));

		PartDefinition cube_r165 = lowerjaw3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 80).addBox(-0.8517F, 0.354F, -1.0779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 3.0425F, -0.2958F, 0.0336F, -2.9488F));

		PartDefinition cube_r166 = lowerjaw3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 80).addBox(-0.8517F, -0.1105F, -1.0069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 3.0425F, -0.3831F, 0.0336F, -2.9488F));

		PartDefinition cube_r167 = lowerjaw3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 79).addBox(-0.8517F, 0.2746F, -1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 74).addBox(-0.8517F, -0.2254F, -1.1955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 3.0425F, -0.2086F, 0.0336F, -2.9488F));

		PartDefinition lowerjaw4_r12 = lowerjaw3.addOrReplaceChild("lowerjaw4_r12", CubeListBuilder.create().texOffs(70, 79).addBox(-0.4952F, -0.4961F, -0.8741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4689F, 1.3508F, 3.248F, -0.065F, 0.0096F, 0.013F));

		PartDefinition lowerjaw4_r13 = lowerjaw3.addOrReplaceChild("lowerjaw4_r13", CubeListBuilder.create().texOffs(5, 64).addBox(-1.2F, -0.3238F, -0.1876F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5809F, 0.8102F, 2.8205F, -1.6271F, 0.0096F, 0.013F));

		PartDefinition cube_r168 = lowerjaw3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7422F, 1.0087F, 2.0242F, 0.6948F, -0.0253F, 0.0412F));

		PartDefinition lowerjaw3_r8 = lowerjaw3.addOrReplaceChild("lowerjaw3_r8", CubeListBuilder.create().texOffs(57, 63).addBox(-1.2F, 0.0643F, -0.5281F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5825F, 0.8728F, 2.7425F, -0.8941F, 0.0096F, 0.013F));

		PartDefinition lowerjawslope = lowerjaw2.addOrReplaceChild("lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.9F, -0.3643F, 0.0F, 0.0F));

		PartDefinition lowerjawslope_r1 = lowerjawslope.addOrReplaceChild("lowerjawslope_r1", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5146F, -0.5792F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.3144F, 0.349F, 2.7306F, -0.6366F, -0.006F, -0.015F));

		PartDefinition lowerjawslope_r2 = lowerjawslope.addOrReplaceChild("lowerjawslope_r2", CubeListBuilder.create().texOffs(10, 80).addBox(-0.4854F, -0.5792F, -0.7965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.4856F, 0.349F, 2.7306F, -0.6366F, 0.006F, 0.015F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9627F, -4.9899F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r1 = upperjaw1.addOrReplaceChild("upperjaw4_r1", CubeListBuilder.create().texOffs(85, 77).addBox(-0.5F, -0.1454F, -0.1373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2611F, -2.2085F, -0.4058F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r1 = upperjaw1.addOrReplaceChild("upperjaw3_r1", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.5403F, -1.5053F, 0.4712F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r2 = upperjaw1.addOrReplaceChild("upperjaw4_r2", CubeListBuilder.create().texOffs(54, 11).addBox(-1.5F, -0.0125F, 0.0464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 0.85F, -1.3497F, 0.2356F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r2 = upperjaw1.addOrReplaceChild("upperjaw3_r2", CubeListBuilder.create().texOffs(30, 49).addBox(-1.5F, -0.0037F, 0.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6046F, -0.3401F, -0.0524F, 0.0F, 0.0F));

		PartDefinition upperjaw2 = upperjaw1.addOrReplaceChild("upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r3 = upperjaw2.addOrReplaceChild("upperjaw3_r3", CubeListBuilder.create().texOffs(0, 58).addBox(-0.5F, -0.6F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1134F, 4.0517F, 0.1745F, 0.0F, 0.0F));

		PartDefinition nose = upperjaw2.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition bone6 = nose.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7506F, -0.6172F, 5.1538F, 0.0124F, 0.2037F, 0.1391F));

		PartDefinition nose_r1 = bone6.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(5, 77).addBox(-0.4977F, -0.4492F, -0.6216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(77, 5).addBox(-0.4977F, -0.4492F, -0.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0029F, -0.0046F, -0.0031F, 0.7709F, 0.096F, -0.0573F));

		PartDefinition nose_r2 = bone6.addOrReplaceChild("nose_r2", CubeListBuilder.create().texOffs(76, 42).addBox(-0.5727F, -0.6364F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0029F, -0.0046F, -0.0031F, 1.0329F, -0.0916F, 0.0544F));

		PartDefinition nose_r3 = bone6.addOrReplaceChild("nose_r3", CubeListBuilder.create().texOffs(77, 2).addBox(-0.4977F, -0.5864F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0029F, -0.0046F, -0.0031F, 1.0327F, 0.096F, -0.0573F));

		PartDefinition nose_r4 = bone6.addOrReplaceChild("nose_r4", CubeListBuilder.create().texOffs(59, 76).addBox(-0.4977F, -0.5831F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(-0.0029F, -0.0046F, -0.0031F, 0.4567F, 0.096F, -0.0573F));

		PartDefinition bone10 = nose.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7506F, -0.6172F, 5.1538F, 0.0124F, -0.2037F, -0.1391F));

		PartDefinition nose_r5 = bone10.addOrReplaceChild("nose_r5", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.5023F, -0.4492F, -0.6216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(77, 5).mirror().addBox(-0.5023F, -0.4492F, -0.3216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0029F, -0.0046F, -0.0031F, 0.7709F, -0.096F, 0.0573F));

		PartDefinition nose_r6 = bone10.addOrReplaceChild("nose_r6", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.4273F, -0.6364F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0029F, -0.0046F, -0.0031F, 1.0329F, 0.0916F, -0.0544F));

		PartDefinition nose_r7 = bone10.addOrReplaceChild("nose_r7", CubeListBuilder.create().texOffs(77, 2).mirror().addBox(-0.5023F, -0.5864F, -0.6814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0029F, -0.0046F, -0.0031F, 1.0327F, -0.096F, 0.0573F));

		PartDefinition nose_r8 = bone10.addOrReplaceChild("nose_r8", CubeListBuilder.create().texOffs(59, 76).mirror().addBox(-0.5023F, -0.5831F, -0.3797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(0.0029F, -0.0046F, -0.0031F, 0.4567F, -0.096F, 0.0573F));

		PartDefinition bone4 = upperjaw1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.9F, -0.1F, -1.0F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 84).addBox(-0.479F, -1.4185F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0434F, 4.6053F, 0.439F, 0.1038F, 0.1388F, -0.1059F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(82, 24).addBox(-0.2593F, -0.9637F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0566F, 4.6053F, 0.439F, 0.4329F, 0.0306F, -0.0259F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(82, 3).addBox(-0.4843F, 0.8863F, -0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(82, 0).addBox(-0.4843F, 0.4863F, -0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0434F, 4.6053F, 0.439F, 0.4297F, 0.1527F, -0.0262F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 72).addBox(-0.525F, -1.125F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3481F, 3.144F, -1.1743F, -2.3826F, 1.5166F, -2.3971F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(58, 72).addBox(-0.525F, -1.025F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3481F, 3.144F, -1.1743F, -0.041F, 0.4317F, -0.031F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(72, 54).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1071F, 3.1107F, -0.5061F, 0.0318F, 0.276F, -0.052F));

		PartDefinition cube_r175 = bone4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(44, 72).addBox(-0.4675F, -0.9293F, -0.473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0434F, 4.6053F, 0.439F, 0.0544F, 0.1527F, -0.0262F));

		PartDefinition upperjaw9_r1 = bone4.addOrReplaceChild("upperjaw9_r1", CubeListBuilder.create().texOffs(59, 0).addBox(-0.4921F, -0.3027F, -0.9245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3686F, 2.1839F, -0.8552F, 1.0717F, 0.309F, -0.1306F));

		PartDefinition upperjaw8_r1 = bone4.addOrReplaceChild("upperjaw8_r1", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5308F, -0.7225F, -0.7214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3686F, 2.1839F, -0.8552F, 1.5851F, 0.1004F, -0.0069F));

		PartDefinition upperjaw7_r1 = bone4.addOrReplaceChild("upperjaw7_r1", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5558F, -0.7271F, -0.2871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3686F, 2.1839F, -0.8552F, 1.2246F, 0.027F, 0.2016F));

		PartDefinition upperjaw6_r1 = bone4.addOrReplaceChild("upperjaw6_r1", CubeListBuilder.create().texOffs(85, 83).addBox(-0.8518F, 0.0286F, -0.9277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.163F, 1.0464F, -0.3602F, 0.5223F, 0.2383F, 0.1269F));

		PartDefinition upperjaw5_r1 = bone4.addOrReplaceChild("upperjaw5_r1", CubeListBuilder.create().texOffs(39, 72).addBox(-1.0768F, -0.7964F, -0.8277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3348F, 1.6221F, 0.7264F, 0.2556F, -0.037F, 0.0561F));

		PartDefinition upperjaw7_r2 = bone4.addOrReplaceChild("upperjaw7_r2", CubeListBuilder.create().texOffs(64, 76).addBox(-0.5001F, -0.6363F, -0.9589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1926F, 3.0722F, 0.0656F, -0.4856F, 0.2966F, -0.0014F));

		PartDefinition upperjaw9_r2 = bone4.addOrReplaceChild("upperjaw9_r2", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5001F, -0.7242F, -0.071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0145F)), PartPose.offsetAndRotation(-0.1926F, 3.0722F, 0.0656F, -1.2538F, 0.2635F, -0.0654F));

		PartDefinition upperjaw8_r2 = bone4.addOrReplaceChild("upperjaw8_r2", CubeListBuilder.create().texOffs(44, 56).addBox(-0.525F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(-0.1817F, 2.7679F, 0.0275F, -1.0581F, 0.2995F, 0.0174F));

		PartDefinition upperjaw4_r3 = bone4.addOrReplaceChild("upperjaw4_r3", CubeListBuilder.create().texOffs(30, 52).addBox(0.0F, -0.875F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5242F, 2.1947F, 1.7416F, 0.3422F, 0.1617F, -0.035F));

		PartDefinition upperjaw3_r4 = bone4.addOrReplaceChild("upperjaw3_r4", CubeListBuilder.create().texOffs(73, 72).addBox(-0.05F, -1.175F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5746F, 2.5973F, 1.4389F, 0.5072F, -0.028F, -0.1616F));

		PartDefinition upperjaw2_r1 = bone4.addOrReplaceChild("upperjaw2_r1", CubeListBuilder.create().texOffs(84, 74).addBox(-0.507F, -1.0573F, -0.3883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1926F, 3.0722F, 0.0656F, 0.3371F, 0.3013F, -0.0362F));

		PartDefinition cube_r176 = bone4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(34, 72).addBox(-0.4739F, -0.9051F, -0.5994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.0434F, 4.6053F, 0.439F, 0.2115F, 0.1527F, -0.0262F));

		PartDefinition cube_r177 = bone4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(84, 20).addBox(-0.479F, -1.2912F, -0.6034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0434F, 4.6053F, 0.439F, -0.0708F, 0.1388F, -0.1059F));

		PartDefinition upperjaw4_r4 = bone4.addOrReplaceChild("upperjaw4_r4", CubeListBuilder.create().texOffs(51, 30).addBox(-0.575F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0556F, 1.3002F, 1.7292F, -0.0203F, 0.0652F, 0.0992F));

		PartDefinition upperjaw3_r5 = bone4.addOrReplaceChild("upperjaw3_r5", CubeListBuilder.create().texOffs(33, 31).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0556F, 1.3002F, 1.7292F, -0.0205F, 0.1525F, 0.0975F));

		PartDefinition bone7 = upperjaw1.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.1F, -1.0F));

		PartDefinition cube_r178 = bone7.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.521F, -1.4185F, -0.548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0434F, 4.6053F, 0.439F, 0.1038F, -0.1388F, 0.1059F));

		PartDefinition cube_r179 = bone7.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.7407F, -0.9637F, 0.6367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0566F, 4.6053F, 0.439F, 0.4329F, -0.0306F, 0.0259F));

		PartDefinition cube_r180 = bone7.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-0.5157F, 0.8863F, -0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(82, 0).mirror().addBox(-0.5157F, 0.4863F, -0.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0434F, 4.6053F, 0.439F, 0.4297F, -0.1527F, 0.0262F));

		PartDefinition cube_r181 = bone7.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.475F, -1.125F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3481F, 3.144F, -1.1743F, -2.3826F, -1.5166F, 2.3971F));

		PartDefinition cube_r182 = bone7.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.475F, -1.025F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3481F, 3.144F, -1.1743F, -0.041F, -0.4317F, 0.031F));

		PartDefinition cube_r183 = bone7.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1071F, 3.1107F, -0.5061F, 0.0318F, -0.276F, 0.052F));

		PartDefinition cube_r184 = bone7.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.5325F, -0.9293F, -0.473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.0434F, 4.6053F, 0.439F, 0.0544F, -0.1527F, 0.0262F));

		PartDefinition upperjaw10_r1 = bone7.addOrReplaceChild("upperjaw10_r1", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5079F, -0.3027F, -0.9245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3686F, 2.1839F, -0.8552F, 1.0717F, -0.309F, 0.1306F));

		PartDefinition upperjaw9_r3 = bone7.addOrReplaceChild("upperjaw9_r3", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.4692F, -0.7225F, -0.7214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3686F, 2.1839F, -0.8552F, 1.5851F, -0.1004F, 0.0069F));

		PartDefinition upperjaw8_r3 = bone7.addOrReplaceChild("upperjaw8_r3", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.4442F, -0.7271F, -0.2871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3686F, 2.1839F, -0.8552F, 1.2246F, -0.027F, -0.2016F));

		PartDefinition upperjaw7_r3 = bone7.addOrReplaceChild("upperjaw7_r3", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.1482F, 0.0286F, -0.9277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.163F, 1.0464F, -0.3602F, 0.5223F, -0.2383F, -0.1269F));

		PartDefinition upperjaw6_r2 = bone7.addOrReplaceChild("upperjaw6_r2", CubeListBuilder.create().texOffs(39, 72).mirror().addBox(0.0768F, -0.7964F, -0.8277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3348F, 1.6221F, 0.7264F, 0.2556F, 0.037F, -0.0561F));

		PartDefinition upperjaw8_r4 = bone7.addOrReplaceChild("upperjaw8_r4", CubeListBuilder.create().texOffs(64, 76).mirror().addBox(-0.4999F, -0.6363F, -0.9589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1926F, 3.0722F, 0.0656F, -0.4856F, -0.2966F, 0.0014F));

		PartDefinition upperjaw10_r2 = bone7.addOrReplaceChild("upperjaw10_r2", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.4999F, -0.7242F, -0.071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0145F)).mirror(false), PartPose.offsetAndRotation(0.1926F, 3.0722F, 0.0656F, -1.2538F, -0.2635F, 0.0654F));

		PartDefinition upperjaw9_r4 = bone7.addOrReplaceChild("upperjaw9_r4", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.475F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(0.1817F, 2.7679F, 0.0275F, -1.0581F, -0.2995F, -0.0174F));

		PartDefinition upperjaw5_r2 = bone7.addOrReplaceChild("upperjaw5_r2", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-1.0F, -0.875F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5242F, 2.1947F, 1.7416F, 0.3422F, -0.1617F, 0.035F));

		PartDefinition upperjaw4_r5 = bone7.addOrReplaceChild("upperjaw4_r5", CubeListBuilder.create().texOffs(73, 72).mirror().addBox(-0.95F, -1.175F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.5746F, 2.5973F, 1.4389F, 0.5072F, 0.028F, 0.1616F));

		PartDefinition upperjaw3_r6 = bone7.addOrReplaceChild("upperjaw3_r6", CubeListBuilder.create().texOffs(84, 74).mirror().addBox(-0.493F, -1.0573F, -0.3883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1926F, 3.0722F, 0.0656F, 0.3371F, -0.3013F, 0.0362F));

		PartDefinition cube_r185 = bone7.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(34, 72).mirror().addBox(-0.5261F, -0.9051F, -0.5994F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.0434F, 4.6053F, 0.439F, 0.2115F, -0.1527F, 0.0262F));

		PartDefinition cube_r186 = bone7.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(-0.521F, -1.2912F, -0.6034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0434F, 4.6053F, 0.439F, -0.0708F, -0.1388F, 0.1059F));

		PartDefinition upperjaw5_r3 = bone7.addOrReplaceChild("upperjaw5_r3", CubeListBuilder.create().texOffs(51, 30).mirror().addBox(-0.425F, -0.5F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0556F, 1.3002F, 1.7292F, -0.0203F, -0.0652F, -0.0992F));

		PartDefinition upperjaw4_r6 = bone7.addOrReplaceChild("upperjaw4_r6", CubeListBuilder.create().texOffs(33, 31).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0556F, 1.3002F, 1.7292F, -0.0205F, -0.1525F, -0.0975F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.5F, 1.0922F, -3.4118F));

		PartDefinition head_r6 = bone3.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(37, 52).addBox(-0.4957F, 0.1564F, -1.9899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9483F, -2.9437F, 1.2825F, 0.2404F, 0.2819F, 0.0471F));

		PartDefinition head_r7 = bone3.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(50, 47).addBox(-1.8F, -0.8F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7304F, -1.8423F, 2.7232F, 0.8579F, 1.2866F, 0.8931F));

		PartDefinition head_r8 = bone3.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(10, 73).addBox(-0.55F, -0.8F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.29F, -1.9057F, 2.7949F, 0.4851F, 1.0986F, 0.4943F));

		PartDefinition head_r9 = bone3.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7069F, -2.7497F, 3.3632F, 0.1798F, 0.752F, -0.2058F));

		PartDefinition head_r10 = bone3.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(9, 43).addBox(-1.4F, -0.725F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3151F, -2.4092F, 2.7617F, 0.2309F, 1.3439F, 0.0262F));

		PartDefinition head_r11 = bone3.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(20, 73).addBox(-0.5F, -1.0274F, -0.3751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6749F, -2.2894F, 2.2724F, -0.2162F, 0.7968F, 0.0993F));

		PartDefinition head_r12 = bone3.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(25, 85).addBox(-0.5F, -1.044F, -0.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.6749F, -2.2894F, 2.2724F, 0.351F, 0.7968F, 0.0993F));

		PartDefinition head_r13 = bone3.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -0.9F, -1.325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8418F, -1.9621F, 1.0713F, 0.4654F, 0.4521F, 0.0054F));

		PartDefinition head_r14 = bone3.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.8921F, -2.7096F, 2.5217F, 0.3783F, 0.8952F, 0.2667F));

		PartDefinition head_r15 = bone3.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(60, 82).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.6073F, -2.7748F, 2.1672F, 0.5889F, 0.8679F, 0.1646F));

		PartDefinition head_r16 = bone3.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(82, 59).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.3022F, -2.7039F, 1.848F, 0.7199F, 0.6927F, 0.141F));

		PartDefinition head_r17 = bone3.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(82, 56).addBox(-0.5F, -0.275F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.1154F, -2.8101F, 1.5395F, 0.6406F, 0.5568F, 0.0057F));

		PartDefinition head_r18 = bone3.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(82, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.8854F, -2.4277F, 1.1735F, 0.6399F, 0.4208F, 0.014F));

		PartDefinition head_r19 = bone3.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(0, 67).addBox(-0.4999F, -1.0424F, -0.8206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3722F, -2.1676F, 1.958F, 0.2479F, 0.5568F, 0.0057F));

		PartDefinition head_r20 = bone3.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2914F, -1.7538F, 1.9993F, -0.0146F, 0.4521F, 0.0054F));

		PartDefinition head_r21 = bone3.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6341F, -1.1465F, 0.3136F, -0.0782F, 0.3905F, -0.1496F));

		PartDefinition head_r22 = bone3.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(46, 22).addBox(-0.5466F, -2.1489F, -0.4256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5346F, -0.1152F, 1.7304F, -0.1017F, 0.4336F, -0.2024F));

		PartDefinition head_r23 = bone3.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(46, 6).addBox(-0.5466F, -1.9989F, 0.0994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.154F, -0.12F, 1.0268F, 0.0701F, 0.4857F, -0.2085F));

		PartDefinition head_r24 = bone3.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.573F, -1.2833F, 6.0436F, -1.7979F, 0.0152F, -0.0213F));

		PartDefinition head_r25 = bone3.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(23, 49).addBox(-1.05F, -1.7F, 0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3234F, -0.8939F, 2.2207F, 1.3903F, 0.5231F, -0.2522F));

		PartDefinition head_r26 = bone3.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(39, 6).addBox(-0.9937F, -2.9453F, -0.1675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0398F, 1.2112F, 3.9544F, 0.5181F, 0.13F, -0.1904F));

		PartDefinition head_r27 = bone3.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -2.975F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6121F, 1.3663F, 4.8988F, -0.0787F, 0.0152F, -0.0213F));

		PartDefinition head_r28 = bone3.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(85, 80).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6121F, 0.7856F, 5.7129F, -0.9514F, 0.0152F, -0.0213F));

		PartDefinition head_r29 = bone3.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(59, 15).addBox(-0.9F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.0528F, -1.902F, 4.0261F, -1.6094F, 0.4338F, -0.037F));

		PartDefinition head_r30 = bone3.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(59, 11).addBox(-0.375F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.5221F, -2.7623F, 4.8651F, -1.6059F, 0.0152F, -0.0213F));

		PartDefinition head_r31 = bone3.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(35, 85).addBox(-0.375F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(60, 85).addBox(-0.375F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5625F, -1.3621F, 5.5631F, 2.0506F, 0.0152F, -0.0213F));

		PartDefinition head_r32 = bone3.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(55, 85).addBox(-0.375F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.543F, -2.1364F, 5.3629F, -2.8887F, 0.0152F, -0.0213F));

		PartDefinition head_r33 = bone3.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(25, 82).addBox(-0.375F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5221F, -2.7623F, 4.8651F, -2.4698F, 0.0152F, -0.0213F));

		PartDefinition head_r34 = bone3.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(58, 51).addBox(-0.5F, -0.475F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(2.8879F, 0.4756F, 3.867F, -1.3483F, 0.4687F, -0.0385F));

		PartDefinition head_r35 = bone3.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(58, 27).addBox(-0.5F, -0.3F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(2.8879F, 0.4756F, 3.867F, -1.2174F, 0.4687F, -0.0385F));

		PartDefinition head_r36 = bone3.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(37, 25).addBox(-0.5F, -0.25F, -2.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.345F)), PartPose.offsetAndRotation(2.8879F, 0.4756F, 3.867F, -1.0429F, 0.4687F, -0.0385F));

		PartDefinition head_r37 = bone3.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(58, 59).addBox(-0.65F, -0.375F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.359F))
				.texOffs(21, 58).addBox(-1.0F, 0.0F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.0543F, -0.6759F, 3.951F, -1.6101F, 0.4687F, -0.0385F));

		PartDefinition head_r38 = bone3.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(38, 36).addBox(-0.5F, -0.525F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5486F, -1.2982F, 4.456F, -1.6059F, 0.0152F, -0.0213F));

		PartDefinition head_r39 = bone3.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(58, 55).addBox(-0.5F, 0.025F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5904F, -0.3091F, 5.8185F, -1.667F, 0.0152F, -0.0213F));

		PartDefinition head_r40 = bone3.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(86, 17).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5557F, -2.2513F, 5.7934F, -1.3179F, 0.0233F, -0.0119F));

		PartDefinition head_r41 = bone3.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(73, 38).addBox(0.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9483F, -1.3579F, 6.0474F, -1.7049F, 0.3983F, -0.1445F));

		PartDefinition head_r42 = bone3.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(62, 66).addBox(0.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6965F, -2.286F, 5.7731F, -1.2686F, 0.3983F, -0.1445F));

		PartDefinition head_r43 = bone3.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.3317F, -2.9801F, 5.1526F, -0.8322F, 0.3983F, -0.1445F));

		PartDefinition head_r44 = bone3.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5313F, -2.9944F, 5.1246F, -0.8379F, 0.0233F, -0.0119F));

		PartDefinition head_r45 = bone3.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(30, 6).addBox(0.0002F, -0.0078F, -2.9855F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0084F, -3.1492F, 4.2314F, 0.182F, 0.5091F, 0.0517F));

		PartDefinition head_r46 = bone3.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(9, 47).addBox(-1.9998F, -0.0078F, -1.9855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.006F, -3.1948F, 4.1449F, 0.1436F, 0.0433F, -0.0228F));

		PartDefinition head_r47 = bone3.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(14, 57).addBox(-0.9998F, -0.0078F, -1.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.006F, -3.1948F, 4.1449F, 0.1701F, 0.3532F, 0.027F));

		PartDefinition head_r48 = bone3.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(25, 75).addBox(0.0F, -1.075F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0159F, -2.1071F, 4.0354F, -0.2415F, 0.346F, -0.0899F));

		PartDefinition head_r49 = bone3.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(10, 86).addBox(-0.5F, -1.075F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5306F, -1.99F, 4.5848F, -0.227F, 0.0233F, -0.0119F));

		PartDefinition head_r50 = bone3.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(73, 15).addBox(-0.6226F, -0.4355F, -0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3348F, -1.937F, 1.6452F, -2.914F, 0.4827F, -0.0781F));

		PartDefinition head_r51 = bone3.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(50, 85).addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 85).addBox(-0.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4411F, -1.9361F, 1.6536F, -0.0218F, 0.535F, -0.0794F));

		PartDefinition head_r52 = bone3.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(40, 85).addBox(-0.6226F, -0.323F, -0.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3348F, -1.937F, 1.6452F, -1.557F, 0.4827F, -0.0781F));

		PartDefinition head_r53 = bone3.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(65, 85).addBox(-0.5761F, -0.6617F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3867F, -1.8832F, 1.8067F, -0.9102F, 0.5653F, -0.0819F));

		PartDefinition head_r54 = bone3.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(51, 56).addBox(-0.4948F, -1.0809F, -0.7863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1161F, -0.5184F, 0.8184F, -1.438F, 0.0898F, -0.34F));

		PartDefinition head_r55 = bone3.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(74, 76).addBox(-0.4948F, -0.4236F, -0.2665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1161F, -0.5184F, 0.8184F, -0.609F, 0.0898F, -0.34F));

		PartDefinition head_r56 = bone3.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(69, 76).addBox(-0.4948F, -0.4838F, -1.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1161F, -0.5184F, 0.8184F, -0.3036F, 0.0898F, -0.34F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(2.5706F, -0.1316F, 4.2695F));

		PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.0922F, -3.4118F));

		PartDefinition head_r57 = bone8.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(37, 52).mirror().addBox(-0.5043F, 0.1564F, -1.9899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9483F, -2.9437F, 1.2825F, 0.2404F, -0.2819F, -0.0471F));

		PartDefinition head_r58 = bone8.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(50, 47).mirror().addBox(-0.2F, -0.8F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7304F, -1.8423F, 2.7232F, 0.8579F, -1.2866F, -0.8931F));

		PartDefinition head_r59 = bone8.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(10, 73).mirror().addBox(-0.45F, -0.8F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.29F, -1.9057F, 2.7949F, 0.4851F, -1.0986F, -0.4943F));

		PartDefinition head_r60 = bone8.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7069F, -2.7497F, 3.3632F, 0.1798F, -0.752F, 0.2058F));

		PartDefinition head_r61 = bone8.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-0.6F, -0.725F, -1.425F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3151F, -2.4092F, 2.7617F, 0.2309F, -1.3439F, -0.0262F));

		PartDefinition head_r62 = bone8.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(20, 73).mirror().addBox(-0.5F, -1.0274F, -0.3751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6749F, -2.2894F, 2.2724F, -0.2162F, -0.7968F, -0.0993F));

		PartDefinition head_r63 = bone8.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(25, 85).mirror().addBox(-0.5F, -1.044F, -0.62F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.6749F, -2.2894F, 2.2724F, 0.351F, -0.7968F, -0.0993F));

		PartDefinition head_r64 = bone8.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -0.9F, -1.325F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8418F, -1.9621F, 1.0713F, 0.4654F, -0.4521F, -0.0054F));

		PartDefinition head_r65 = bone8.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.8921F, -2.7096F, 2.5217F, 0.3783F, -0.8952F, -0.2667F));

		PartDefinition head_r66 = bone8.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.6073F, -2.7748F, 2.1672F, 0.5889F, -0.8679F, -0.1646F));

		PartDefinition head_r67 = bone8.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.3022F, -2.7039F, 1.848F, 0.7199F, -0.6927F, -0.141F));

		PartDefinition head_r68 = bone8.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(-0.5F, -0.275F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.1154F, -2.8101F, 1.5395F, 0.6406F, -0.5568F, -0.0057F));

		PartDefinition head_r69 = bone8.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.8854F, -2.4277F, 1.1735F, 0.6399F, -0.4208F, -0.014F));

		PartDefinition head_r70 = bone8.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.5001F, -1.0424F, -0.8206F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3722F, -2.1676F, 1.958F, 0.2479F, -0.5568F, -0.0057F));

		PartDefinition head_r71 = bone8.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.5F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2914F, -1.7538F, 1.9993F, -0.0146F, -0.4521F, -0.0054F));

		PartDefinition head_r72 = bone8.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(36, 47).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6341F, -1.1465F, 0.3136F, -0.0782F, -0.3905F, 0.1496F));

		PartDefinition head_r73 = bone8.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(46, 22).mirror().addBox(-0.4534F, -2.1489F, -0.4256F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.5346F, -0.1152F, 1.7304F, -0.1017F, -0.4336F, 0.2024F));

		PartDefinition head_r74 = bone8.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(46, 6).mirror().addBox(-0.4534F, -1.9989F, 0.0994F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.154F, -0.12F, 1.0268F, 0.0701F, -0.4857F, 0.2085F));

		PartDefinition head_r75 = bone8.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(20, 86).mirror().addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.573F, -1.2833F, 6.0436F, -1.7979F, -0.0152F, 0.0213F));

		PartDefinition head_r76 = bone8.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(23, 49).mirror().addBox(0.05F, -1.7F, 0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3234F, -0.8939F, 2.2207F, 1.3903F, -0.5231F, 0.2522F));

		PartDefinition head_r77 = bone8.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(39, 6).mirror().addBox(-0.0063F, -2.9453F, -0.1675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0398F, 1.2112F, 3.9544F, 0.5181F, -0.13F, 0.1904F));

		PartDefinition head_r78 = bone8.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-0.5F, -2.975F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6121F, 1.3663F, 4.8988F, -0.0787F, -0.0152F, 0.0213F));

		PartDefinition head_r79 = bone8.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6121F, 0.7856F, 5.7129F, -0.9514F, -0.0152F, 0.0213F));

		PartDefinition head_r80 = bone8.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.0528F, -1.902F, 4.0261F, -1.6094F, -0.4338F, 0.037F));

		PartDefinition head_r81 = bone8.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(59, 11).mirror().addBox(-0.625F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.5221F, -2.7623F, 4.8651F, -1.6059F, -0.0152F, 0.0213F));

		PartDefinition head_r82 = bone8.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.625F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(60, 85).mirror().addBox(-0.625F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5625F, -1.3621F, 5.5631F, 2.0506F, -0.0152F, 0.0213F));

		PartDefinition head_r83 = bone8.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-0.625F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.543F, -2.1364F, 5.3629F, -2.8887F, -0.0152F, 0.0213F));

		PartDefinition head_r84 = bone8.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.625F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5221F, -2.7623F, 4.8651F, -2.4698F, -0.0152F, 0.0213F));

		PartDefinition head_r85 = bone8.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(58, 51).mirror().addBox(-0.5F, -0.475F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-2.8879F, 0.4756F, 3.867F, -1.3483F, -0.4687F, 0.0385F));

		PartDefinition head_r86 = bone8.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(58, 27).mirror().addBox(-0.5F, -0.3F, -1.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-2.8879F, 0.4756F, 3.867F, -1.2174F, -0.4687F, 0.0385F));

		PartDefinition head_r87 = bone8.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-0.5F, -0.25F, -2.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.345F)).mirror(false), PartPose.offsetAndRotation(-2.8879F, 0.4756F, 3.867F, -1.0429F, -0.4687F, 0.0385F));

		PartDefinition head_r88 = bone8.addOrReplaceChild("head_r88", CubeListBuilder.create().texOffs(58, 59).mirror().addBox(-0.35F, -0.375F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.359F)).mirror(false)
				.texOffs(21, 58).mirror().addBox(0.0F, 0.0F, -1.45F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.0543F, -0.6759F, 3.951F, -1.6101F, -0.4687F, 0.0385F));

		PartDefinition head_r89 = bone8.addOrReplaceChild("head_r89", CubeListBuilder.create().texOffs(38, 36).mirror().addBox(-0.5F, -0.525F, -0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5486F, -1.2982F, 4.456F, -1.6059F, -0.0152F, 0.0213F));

		PartDefinition head_r90 = bone8.addOrReplaceChild("head_r90", CubeListBuilder.create().texOffs(58, 55).mirror().addBox(-0.5F, 0.025F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5904F, -0.3091F, 5.8185F, -1.667F, -0.0152F, 0.0213F));

		PartDefinition head_r91 = bone8.addOrReplaceChild("head_r91", CubeListBuilder.create().texOffs(86, 17).mirror().addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5557F, -2.2513F, 5.7934F, -1.3179F, -0.0233F, 0.0119F));

		PartDefinition head_r92 = bone8.addOrReplaceChild("head_r92", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-1.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9483F, -1.3579F, 6.0474F, -1.7049F, -0.3983F, 0.1445F));

		PartDefinition head_r93 = bone8.addOrReplaceChild("head_r93", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-1.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6965F, -2.286F, 5.7731F, -1.2686F, -0.3983F, 0.1445F));

		PartDefinition head_r94 = bone8.addOrReplaceChild("head_r94", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-1.0F, 0.025F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3317F, -2.9801F, 5.1526F, -0.8322F, -0.3983F, 0.1445F));

		PartDefinition head_r95 = bone8.addOrReplaceChild("head_r95", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-0.5F, 0.025F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5313F, -2.9944F, 5.1246F, -0.8379F, -0.0233F, 0.0119F));

		PartDefinition head_r96 = bone8.addOrReplaceChild("head_r96", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-1.0002F, -0.0078F, -2.9855F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0084F, -3.1492F, 4.2314F, 0.182F, -0.5091F, -0.0517F));

		PartDefinition head_r97 = bone8.addOrReplaceChild("head_r97", CubeListBuilder.create().texOffs(9, 47).mirror().addBox(0.9998F, -0.0078F, -1.9855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.006F, -3.1948F, 4.1449F, 0.1436F, -0.0433F, 0.0228F));

		PartDefinition head_r98 = bone8.addOrReplaceChild("head_r98", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-0.0002F, -0.0078F, -1.9855F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.006F, -3.1948F, 4.1449F, 0.1701F, -0.3532F, -0.027F));

		PartDefinition head_r99 = bone8.addOrReplaceChild("head_r99", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-1.0F, -1.075F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0159F, -2.1071F, 4.0354F, -0.2415F, -0.346F, 0.0899F));

		PartDefinition head_r100 = bone8.addOrReplaceChild("head_r100", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.5F, -1.075F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5306F, -1.99F, 4.5848F, -0.227F, -0.0233F, 0.0119F));

		PartDefinition head_r101 = bone8.addOrReplaceChild("head_r101", CubeListBuilder.create().texOffs(73, 15).mirror().addBox(-0.3774F, -0.4355F, -0.536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3348F, -1.937F, 1.6452F, -2.914F, -0.4827F, 0.0781F));

		PartDefinition head_r102 = bone8.addOrReplaceChild("head_r102", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 85).mirror().addBox(-0.4375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4411F, -1.9361F, 1.6536F, -0.0218F, -0.535F, 0.0794F));

		PartDefinition head_r103 = bone8.addOrReplaceChild("head_r103", CubeListBuilder.create().texOffs(40, 85).mirror().addBox(-0.3774F, -0.323F, -0.4541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3348F, -1.937F, 1.6452F, -1.557F, -0.4827F, 0.0781F));

		PartDefinition head_r104 = bone8.addOrReplaceChild("head_r104", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-0.4239F, -0.6617F, -0.438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3867F, -1.8832F, 1.8067F, -0.9102F, -0.5653F, 0.0819F));

		PartDefinition head_r105 = bone8.addOrReplaceChild("head_r105", CubeListBuilder.create().texOffs(51, 56).mirror().addBox(-0.5052F, -1.0809F, -0.7863F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1161F, -0.5184F, 0.8184F, -1.438F, -0.0898F, 0.34F));

		PartDefinition head_r106 = bone8.addOrReplaceChild("head_r106", CubeListBuilder.create().texOffs(74, 76).mirror().addBox(-0.5052F, -0.4236F, -0.2665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1161F, -0.5184F, 0.8184F, -0.609F, -0.0898F, 0.34F));

		PartDefinition head_r107 = bone8.addOrReplaceChild("head_r107", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-0.5052F, -0.4838F, -1.1129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1161F, -0.5184F, 0.8184F, -0.3036F, -0.0898F, 0.34F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-2.5706F, -0.1316F, 4.2695F));

		PartDefinition fur1 = body.addOrReplaceChild("fur1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0687F, -18.2658F, 0.4098F, 0.0F, 0.0F));

		PartDefinition fur2 = fur1.addOrReplaceChild("fur2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.182F, 0.0F, 0.0F));

		PartDefinition fur3 = fur2.addOrReplaceChild("fur3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 92, 92);
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