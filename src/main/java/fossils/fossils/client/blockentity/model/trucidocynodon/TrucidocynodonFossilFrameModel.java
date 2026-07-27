package fossils.fossils.client.blockentity.model.trucidocynodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TrucidocynodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Rightfrontfoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Leftfrontfoot2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart body5;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
	private final ModelPart bone4;
	private final ModelPart bone7;

	public TrucidocynodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Bodyfront = this.body4.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Rightfrontfoot2 = this.Rightfrontfoot.getChild("Rightfrontfoot2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Leftfrontfoot2 = this.Leftfrontfoot.getChild("Leftfrontfoot2");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone6 = this.Bodyfront.getChild("bone6");
		this.body5 = this.body4.getChild("body5");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone7 = this.Hips.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -20.0F, 22.0F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4F, -12.5F, -4.7F, -0.6527F, -0.0531F, 1.5015F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -1.75F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(7.4F, -16.05F, -4.7F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-1.6F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -15.5F, 22.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1F, 17.2F, -0.5801F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.825F, -0.075F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8722F, -5.5976F, 0.3978F, -0.1208F, -0.0506F));

		PartDefinition cube_r5 = Belly.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.8F, 6.975F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6573F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0236F, -5.8422F, 0.3319F, -0.0413F, -0.0142F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 13).addBox(-0.5F, 0.8F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, 0.1839F, -0.0858F, -0.0159F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 20).addBox(-0.5F, 0.8F, -0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.104F, -3.9589F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 41).addBox(-0.5F, 0.775F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 38).addBox(-0.5F, 0.775F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -4.0F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r9 = body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, 0.775F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body4.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 0.3971F, -6.7476F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0145F, -5.9138F, -0.2691F, -0.0841F, 0.0232F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2841F, 4.8039F, -3.7671F, 1.4128F, -0.0688F, -0.2543F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0333F, 8.8737F, -2.956F, -1.8813F, 0.0574F, -0.1162F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2374F, -0.7926F, 1.4147F, -0.3995F, 0.1089F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.4201F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2841F, 4.8039F, -3.7671F, 0.1474F, 0.0688F, 0.2543F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0333F, 8.8737F, -2.956F, -1.19F, -0.2302F, -0.1386F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.2374F, -0.7926F, 1.1342F, 0.0843F, 0.0225F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.1147F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(62, 45).addBox(-0.5F, 0.781F, -2.263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2914F, -6.5663F, -0.202F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 46).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.606F, -0.413F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, 0.1497F, -1.776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6667F, -1.875F, -0.2893F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(14, 60).addBox(-0.5F, -0.2503F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.1773F, -0.2188F, -0.1138F));

		PartDefinition cube_r11 = Neck3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 60).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.35F, 0.2497F, -0.126F, 0.1571F, 0.1222F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(14, 64).addBox(-0.5F, -0.2503F, -1.6759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.0947F, -0.2555F, -0.0579F));

		PartDefinition cube_r12 = Neck5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 5).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.349F, 1.3724F, -0.1857F, 0.0531F, 0.0972F, -0.1678F));

		PartDefinition cube_r13 = Neck5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2497F, -0.2759F, 0.0357F, -0.1654F, -0.3527F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1445F, -0.1446F, -0.3851F));

		PartDefinition cube_r14 = Neck6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 66).addBox(-0.575F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2497F, -0.6759F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5574F, -1.1795F, 0.9759F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -1.8361F, -2.4097F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, 1.4777F, -0.7661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.3667F, -1.2203F, -0.5702F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7793F, -1.1299F, -5.1142F, 0.0F, -0.0218F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.3667F, -1.2203F, -0.5702F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7793F, -1.1299F, -5.1142F, 0.0F, 0.0218F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8367F, 1.3744F, -3.1373F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition bone6 = Bodyfront.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8367F, 1.3744F, -3.1373F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.125F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 63).addBox(-0.5F, 0.75F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 62).addBox(-0.5F, 0.75F, 0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3403F, 4.3212F, -0.7079F, 0.4996F, 0.0763F, -0.2349F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3138F, 8.8023F, 0.4881F, 1.2493F, -0.0925F, 0.1499F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0005F, 8.3351F, 0.1951F, 0.7912F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, 0.2934F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3403F, 4.3212F, -0.7079F, 0.0633F, 0.0982F, 0.2383F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3138F, 8.8023F, 0.4881F, 1.1621F, 0.0925F, -0.1499F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0005F, 8.3351F, 0.1951F, -0.0378F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.3611F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(24, 38).addBox(-0.5F, 0.3412F, -0.4143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 41).addBox(-0.5F, 0.3412F, 3.2857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, 0.0446F, -0.0869F, 0.0075F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, 0.2468F, -0.1392F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 38).addBox(-0.5F, 0.2468F, 3.3608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.172F, -0.0872F, -0.0036F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(52, 12).addBox(-0.5F, -0.1869F, 0.097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.455F, 3.8928F, 0.1527F, -0.1294F, -0.0199F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -0.04F, -0.3133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 29).addBox(-0.5F, -0.04F, 3.3867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1718F, 2.9832F, 0.0911F, -0.1304F, -0.0119F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(32, 32).addBox(-0.5F, 0.6796F, -0.1749F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6973F, 3.9901F, 0.1193F, -0.2167F, -0.0258F));

		PartDefinition cube_r16 = Tail5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.5296F, 3.6751F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, 0.2824F, -0.1034F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(16, 36).addBox(-0.5F, 0.2824F, 3.4716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.3973F, 3.8535F, 0.3516F, -0.2325F, -0.1374F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.187F, -0.0858F, -0.0162F));

		PartDefinition cube_r17 = Tail7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8324F, 0.3216F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.0313F, -0.2819F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2894F, 4.8784F, 0.132F, -0.1298F, -0.0172F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(52, 17).addBox(-0.525F, 0.6824F, -0.3784F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7136F, 4.8965F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6794F, 4.7249F, -0.0063F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition bone7 = Hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6794F, 4.7249F, -0.0063F, 0.1298F, -0.017F, -0.0011F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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