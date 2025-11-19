package fossils.fossils.client.blockentity.model.cryptoclidus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CryptoclidusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone11;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart Lowerjaw;

	public CryptoclidusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone12 = this.Hips.getChild("bone12");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone11 = this.chest.getChild("bone11");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone7 = this.Head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone7.getChild("bone9");
		this.bone10 = this.bone7.getChild("bone10");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.9931F, 11.0989F, -0.0502F, 0.0421F, 0.6971F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 93).addBox(0.0F, -1.6411F, 0.0492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7247F, 1.8709F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-1.1977F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.1855F, 0.353F, -0.2369F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 38).mirror().addBox(-2.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.0133F, 0.3895F, -0.7041F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-1.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, 0.1359F, 0.3922F, -0.272F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(77, 34).mirror().addBox(-2.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, -0.0506F, 0.4034F, -0.7459F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 36).addBox(-0.8023F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.1855F, -0.353F, 0.2369F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 38).addBox(1.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.0133F, -0.3895F, 0.7041F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 30).addBox(0.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, 0.1359F, -0.3922F, 0.272F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 34).addBox(0.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, -0.0506F, -0.4034F, 0.7459F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 93).addBox(0.0F, -1.4458F, -0.0603F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 39).addBox(0.0F, -0.4F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7616F, 5.1535F, -0.0959F, 0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(70, 35).addBox(-0.4336F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, -1.8486F, -0.2539F, -0.2156F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 81).addBox(-0.4336F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, -1.1505F, -0.2539F, -0.2156F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(69, 75).addBox(-0.4336F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, -0.7578F, -0.2539F, -0.2156F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(85, 52).addBox(-0.4336F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, -0.1033F, -0.2539F, -0.2156F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(85, 41).addBox(-0.4336F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, 0.2458F, -0.2539F, -0.2156F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(85, 9).addBox(-0.4336F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, 0.7258F, -0.2539F, -0.2156F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(48, 38).addBox(-0.4336F, -0.4934F, -1.9176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3996F, -3.4077F, 0.7575F, 0.9003F, -0.2539F, -0.2156F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(27, 67).addBox(-1.0712F, -0.9309F, 2.0975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.4202F, 0.9616F, 0.0022F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(0, 70).addBox(-0.9698F, -0.9309F, 2.22F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.3148F, 0.7167F, -0.1383F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(62, 16).addBox(0.942F, -0.9309F, -0.0203F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(55, 54).addBox(3.0869F, -0.9309F, -2.4494F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.2643F, -0.4656F, -0.47F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(66, 44).addBox(-0.6204F, -0.9309F, -2.2709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.3409F, -0.9318F, -0.6265F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(20, 59).addBox(-0.1586F, -0.9309F, -0.7873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(64, 54).addBox(-0.1836F, -0.9309F, 1.6377F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.2356F, 0.0F, -0.3491F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(85, 3).addBox(2.3756F, -0.9309F, 0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.2501F, 0.339F, -0.2643F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(59, 39).addBox(2.3464F, -0.9309F, -2.3708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.2939F, -0.6335F, -0.5263F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(64, 0).addBox(2.1615F, -0.942F, -3.986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1826F, -0.4299F, -0.4259F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(73, 56).addBox(3.4414F, -0.942F, -2.834F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1658F, 0.0F, -0.3491F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(80, 56).addBox(2.3146F, -0.942F, -1.9382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1698F, 0.2151F, -0.3125F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(62, 6).addBox(1.5099F, -0.942F, -0.6884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.3477F, 1.0651F, -0.042F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(13, 38).addBox(0.4349F, -0.942F, -4.547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1909F, -0.5157F, -0.4441F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(51, 5).addBox(-2.8344F, -0.942F, -6.082F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.455F, -1.1858F, -0.7748F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(33, 51).addBox(-0.1396F, -0.942F, -3.7362F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1659F, 0.0258F, -0.3447F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(63, 31).addBox(2.5912F, -0.942F, -2.4496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.2626F, 0.8818F, -0.1445F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(52, 31).addBox(1.7173F, -0.942F, -4.9495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1678F, 0.1549F, -0.3229F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(44, 51).addBox(0.5605F, -0.942F, -6.1699F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.478F, -0.4642F, -0.756F, 0.1792F, -0.387F, -0.4173F));

		PartDefinition bone12 = Hips.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7616F, 5.1535F, -0.0959F, 0.0873F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone12.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(70, 35).mirror().addBox(-0.5664F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, -1.8486F, 0.2539F, 0.2156F));

		PartDefinition basin_r26 = bone12.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5664F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, -1.1505F, 0.2539F, 0.2156F));

		PartDefinition basin_r27 = bone12.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(69, 75).mirror().addBox(-0.5664F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, -0.7578F, 0.2539F, 0.2156F));

		PartDefinition basin_r28 = bone12.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(85, 52).mirror().addBox(-0.5664F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, -0.1033F, 0.2539F, 0.2156F));

		PartDefinition basin_r29 = bone12.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.5664F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, 0.2458F, 0.2539F, 0.2156F));

		PartDefinition basin_r30 = bone12.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.5664F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, 0.7258F, 0.2539F, 0.2156F));

		PartDefinition basin_r31 = bone12.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-0.5664F, -0.4934F, -1.9176F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3996F, -3.4077F, 0.7575F, 0.9003F, 0.2539F, 0.2156F));

		PartDefinition basin_r32 = bone12.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(0.0712F, -0.9309F, 2.0975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.4202F, -0.9616F, -0.0022F));

		PartDefinition basin_r33 = bone12.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.0302F, -0.9309F, 2.22F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.3148F, -0.7167F, 0.1383F));

		PartDefinition basin_r34 = bone12.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-2.942F, -0.9309F, -0.0203F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(55, 54).mirror().addBox(-4.0869F, -0.9309F, -2.4494F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.2643F, 0.4656F, 0.47F));

		PartDefinition basin_r35 = bone12.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-0.3796F, -0.9309F, -2.2709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.3409F, 0.9318F, 0.6265F));

		PartDefinition basin_r36 = bone12.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-0.8414F, -0.9309F, -0.7873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 54).mirror().addBox(-2.8164F, -0.9309F, 1.6377F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.2356F, 0.0F, 0.3491F));

		PartDefinition basin_r37 = bone12.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-3.3756F, -0.9309F, 0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.2501F, -0.339F, 0.2643F));

		PartDefinition basin_r38 = bone12.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(-3.3464F, -0.9309F, -2.3708F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.2939F, 0.6335F, 0.5263F));

		PartDefinition basin_r39 = bone12.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-4.1615F, -0.942F, -3.986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1826F, 0.4299F, 0.4259F));

		PartDefinition basin_r40 = bone12.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-5.4414F, -0.942F, -2.834F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1658F, 0.0F, 0.3491F));

		PartDefinition basin_r41 = bone12.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(80, 56).mirror().addBox(-3.3146F, -0.942F, -1.9382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1698F, -0.2151F, 0.3125F));

		PartDefinition basin_r42 = bone12.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-3.5099F, -0.942F, -0.6884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.3477F, -1.0651F, 0.042F));

		PartDefinition basin_r43 = bone12.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(13, 38).mirror().addBox(-3.4349F, -0.942F, -4.547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1909F, 0.5157F, 0.4441F));

		PartDefinition basin_r44 = bone12.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(0.8344F, -0.942F, -6.082F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.455F, 1.1858F, 0.7748F));

		PartDefinition basin_r45 = bone12.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(33, 51).mirror().addBox(-1.8604F, -0.942F, -3.7362F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1659F, -0.0258F, 0.3447F));

		PartDefinition basin_r46 = bone12.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-4.5912F, -0.942F, -2.4496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.2626F, -0.8818F, 0.1445F));

		PartDefinition basin_r47 = bone12.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-3.7173F, -0.942F, -4.9495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1678F, -0.1549F, 0.3229F));

		PartDefinition basin_r48 = bone12.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(44, 51).mirror().addBox(-2.5605F, -0.942F, -6.1699F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.478F, -0.4642F, -0.756F, 0.1792F, 0.387F, 0.4173F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5921F, 2.7778F, -1.3483F, 0.1792F, -0.2192F, 0.8603F));

		PartDefinition cube_r12 = BackFlipperR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 64).addBox(-0.85F, 0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = BackFlipperR2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 81).addBox(-1.0F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = BackFlipperR2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(60, 59).addBox(-0.2F, -0.5F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.3316F, 0.0F));

		PartDefinition cube_r15 = BackFlipperR2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 56).addBox(0.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.9234F, 0.0F));

		PartDefinition cube_r16 = BackFlipperR2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(85, 55).addBox(0.0282F, -0.5F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.2029F, 0.0189F, 1.9426F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r17 = BackFlipperR2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 24).addBox(-2.075F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7029F, 0.0189F, 0.4426F, 0.0F, 0.9163F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1244F, 0.0189F, 1.2638F, -0.2351F, -0.5692F, 0.4181F));

		PartDefinition cube_r18 = BackFlipperMiddleR2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 92).addBox(-0.375F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5602F, 0.0F, 0.5652F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r19 = BackFlipperMiddleR2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 92).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1119F, 0.0F, -0.7392F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r20 = BackFlipperMiddleR2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 47).addBox(-0.675F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9105F, 0.0F, -1.7036F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r21 = BackFlipperMiddleR2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(80, 0).addBox(0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(68, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7158F, 0.0F, -1.3142F, 0.0F, 1.9635F, 0.0F));

		PartDefinition cube_r22 = BackFlipperMiddleR2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 80).addBox(-0.6069F, -0.5F, -4.5654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 42).addBox(0.1931F, -0.5F, -4.6654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.2669F, 0.0F, -0.499F, 0.0F, 1.7453F, 0.0F));

		PartDefinition cube_r23 = BackFlipperMiddleR2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 85).addBox(-0.575F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(73, 81).addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5448F, 0.0F, 0.7365F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r24 = BackFlipperMiddleR2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 58).addBox(-0.4F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(37, 81).addBox(-0.8F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1274F, 0.0F, -1.1365F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r25 = BackFlipperMiddleR2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 7).addBox(0.3299F, 0.1765F, 0.0731F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6465F, -0.3213F, -2.8247F, 0.0101F, 0.2002F, 0.0002F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0002F, 0.0F, -3.5511F, -0.0184F, -0.0583F, 0.306F));

		PartDefinition cube_r26 = BackFlipperEndR2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 13).addBox(3.6005F, 0.198F, 0.6197F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6828F, -0.3213F, -0.6728F, 0.0095F, -0.0092F, -0.0032F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5921F, 2.7778F, -1.3483F, 0.1272F, 0.2526F, -1.0821F));

		PartDefinition cube_r27 = BackFlipperR3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 65).addBox(-2.15F, 0.5F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r28 = BackFlipperR3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 87).addBox(0.0F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r29 = BackFlipperR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 20).addBox(-1.8F, -0.5F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.3316F, 0.0F));

		PartDefinition cube_r30 = BackFlipperR3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(59, 36).addBox(-4.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.9234F, 0.0F));

		PartDefinition cube_r31 = BackFlipperR3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 87).addBox(-1.0282F, -0.5F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.2029F, 0.0189F, 1.9426F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r32 = BackFlipperR3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 27).addBox(0.075F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.7029F, 0.0189F, 0.4426F, 0.0F, -0.9163F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1244F, 0.0189F, 1.2638F, -0.2618F, 0.5585F, -0.4682F));

		PartDefinition cube_r33 = BackFlipperMiddleR3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(8, 93).addBox(-0.625F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5602F, 0.0F, 0.5652F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r34 = BackFlipperMiddleR3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 6).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1119F, 0.0F, -0.7392F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r35 = BackFlipperMiddleR3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 93).addBox(-0.325F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9105F, 0.0F, -1.7036F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r36 = BackFlipperMiddleR3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 80).addBox(-1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7158F, 0.0F, -1.3142F, 0.0F, -1.9635F, 0.0F));

		PartDefinition cube_r37 = BackFlipperMiddleR3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 80).addBox(-0.3931F, -0.5F, -4.5654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 53).addBox(-1.1931F, -0.5F, -4.6654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.2669F, 0.0F, -0.499F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r38 = BackFlipperMiddleR3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(56, 88).addBox(-0.425F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(88, 15).addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5448F, 0.0F, 0.7365F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r39 = BackFlipperMiddleR3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(88, 12).addBox(-0.6F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(88, 6).addBox(-0.2F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1274F, 0.0F, -1.1365F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r40 = BackFlipperMiddleR3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(25, 0).addBox(-4.3299F, 0.1765F, 0.0731F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6465F, -0.3213F, -2.8247F, 0.0101F, -0.2002F, -0.0002F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0002F, 0.0F, -3.5511F, -0.0209F, 0.0574F, -0.3497F));

		PartDefinition cube_r41 = BackFlipperEndR3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 17).addBox(-9.6005F, 0.198F, 0.6197F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6828F, -0.3213F, -0.6728F, 0.0095F, 0.0092F, 0.0032F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(26, 39).addBox(-0.5F, -0.2606F, -0.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.625F, 3.0F, 0.0697F, 0.1309F, -0.0023F));

		PartDefinition cube_r42 = Tail1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(94, 79).addBox(0.0F, 0.0754F, 0.0233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6668F, 0.9669F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 93).addBox(0.0F, -0.2003F, -0.0162F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6668F, 2.8669F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(19, 93).addBox(0.0F, -1.5238F, -0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.107F, 2.9749F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(93, 12).addBox(0.0F, -1.4489F, -0.0261F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2117F, 0.9777F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-1.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2394F, 0.9515F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r47 = Tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(54, 25).addBox(-0.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2394F, 0.9515F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(33, 56).addBox(-0.5F, -0.9509F, 0.0452F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, 0.131F, 0.1745F, 0.0F));

		PartDefinition cube_r48 = Tail2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(28, 93).addBox(0.0F, -0.5237F, 0.0394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0785F, 1.0893F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 93).addBox(0.0F, -1.3904F, 0.0531F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(15, 25).mirror().addBox(-1.7F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r51 = Tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 25).addBox(-0.3F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(40, 5).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3569F, 2.9894F, 0.1759F, 0.1744F, 0.0078F));

		PartDefinition cube_r52 = Tail3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(34, 93).addBox(0.0F, -1.4154F, -0.0469F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4128F, 2.1021F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(31, 93).addBox(0.0F, -1.6154F, -0.0469F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2828F, 0.0964F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Tail3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 92).addBox(0.0F, 2.2F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -9.5028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 56).addBox(0.0F, 0.1991F, 0.0273F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4434F, -0.0028F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Tail3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-0.7F, 0.0F, -1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1014F, 1.0445F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r57 = Tail3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 33).addBox(-0.3F, 0.0F, -1.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1014F, 1.0445F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(42, 56).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0032F, 3.8991F, 0.1915F, 0.2181F, -0.0058F));

		PartDefinition cube_r58 = Tail4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(95, 9).addBox(0.0F, -1.0654F, -0.0469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3069F, 2.102F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Tail4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(95, 50).addBox(0.0F, 3.275F, 17.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 3).addBox(0.0F, 2.975F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -15.4028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Tail4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(95, 0).addBox(0.0F, -1.2154F, 0.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3801F, 0.0033F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.6014F, -0.0555F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0339F, 2.9779F, 0.3156F, 0.2179F, 0.0116F));

		PartDefinition cube_r61 = Tail5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(95, 40).addBox(0.0F, -0.8154F, 2.0031F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 95).addBox(0.0F, -0.8904F, 0.0031F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2243F, 0.8839F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Tail5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 95).addBox(0.0F, 3.65F, 19.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1773F, -18.3807F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(30, 25).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Bodymiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(67, 93).addBox(0.0F, -1.525F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Bodymiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 93).addBox(0.5F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Bodymiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(52, 36).mirror().addBox(-1.7147F, -0.0997F, -0.4712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1132F, -2.5322F, 0.2799F, 0.366F, -0.0207F));

		PartDefinition cube_r66 = Bodymiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-3.5117F, -0.8148F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1132F, -2.5322F, 0.0931F, 0.4409F, -0.4889F));

		PartDefinition cube_r67 = Bodymiddle.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-3.7387F, -2.3443F, -0.4587F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1132F, -2.5322F, -0.1352F, 0.4305F, -1.0194F));

		PartDefinition cube_r68 = Bodymiddle.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(-4.5187F, -3.1683F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0382F, -4.5322F, -0.1534F, 0.4535F, -1.0224F));

		PartDefinition cube_r69 = Bodymiddle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-4.5841F, -1.1856F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0382F, -4.5322F, 0.0904F, 0.469F, -0.4854F));

		PartDefinition cube_r70 = Bodymiddle.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(71, 69).mirror().addBox(-2.8436F, 0.0175F, -0.4289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0382F, -4.5322F, 0.2913F, 0.3922F, -0.0118F));

		PartDefinition cube_r71 = Bodymiddle.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(45, 93).mirror().addBox(-3.0176F, -1.5829F, -1.183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.0906F, 0.4686F, -0.6791F));

		PartDefinition cube_r72 = Bodymiddle.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-2.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.2914F, 0.3917F, -0.2055F));

		PartDefinition cube_r73 = Bodymiddle.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(45, 93).addBox(2.0176F, -1.5829F, -1.183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.0906F, -0.4686F, 0.6791F));

		PartDefinition cube_r74 = Bodymiddle.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 16).addBox(1.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.2914F, -0.3917F, 0.2055F));

		PartDefinition cube_r75 = Bodymiddle.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 93).addBox(0.5F, -2.05F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -4.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Bodymiddle.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(81, 28).addBox(2.7387F, -2.3443F, -0.4587F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1132F, -2.5322F, -0.1352F, -0.4305F, 1.0194F));

		PartDefinition cube_r77 = Bodymiddle.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(79, 79).addBox(1.5117F, -0.8148F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1132F, -2.5322F, 0.0931F, -0.4409F, 0.4889F));

		PartDefinition cube_r78 = Bodymiddle.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(52, 36).addBox(-0.2853F, -0.0997F, -0.4712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1132F, -2.5322F, 0.2799F, -0.366F, 0.0207F));

		PartDefinition cube_r79 = Bodymiddle.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 69).addBox(-0.1564F, 0.0175F, -0.4289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0382F, -4.5322F, 0.2913F, -0.3922F, 0.0118F));

		PartDefinition cube_r80 = Bodymiddle.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 30).addBox(2.5841F, -1.1856F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0382F, -4.5322F, 0.0904F, -0.469F, 0.4854F));

		PartDefinition cube_r81 = Bodymiddle.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(94, 65).addBox(3.5187F, -3.1683F, -0.4079F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0382F, -4.5322F, -0.1534F, -0.4535F, 1.0224F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(56, 91).addBox(0.5F, -2.25F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(65, 80).addBox(0.5F, -2.325F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.1F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(94, 67).mirror().addBox(-5.0539F, -3.9929F, -0.349F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, -0.1534F, 0.4535F, -1.1097F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(79, 77).mirror().addBox(-5.4396F, -1.6699F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.0904F, 0.469F, -0.5727F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(40, 61).mirror().addBox(-3.8241F, -0.0598F, -0.3771F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.2913F, 0.3922F, -0.099F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 61).mirror().addBox(-3.8243F, -0.0388F, -0.3982F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.3657F, 0.405F, -0.0719F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-5.4488F, -1.651F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.1529F, 0.5117F, -0.545F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(77, 47).mirror().addBox(-6.0708F, -3.9804F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.125F, 0.5186F, -1.0982F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(94, 67).addBox(4.0539F, -3.9929F, -0.349F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, -0.1534F, -0.4535F, 1.1097F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 77).addBox(3.4396F, -1.6699F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.0904F, -0.469F, 0.5727F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(40, 61).addBox(-0.1759F, -0.0598F, -0.3771F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.2913F, -0.3922F, 0.099F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(29, 61).addBox(-0.1757F, -0.0388F, -0.3982F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.3657F, -0.405F, 0.0719F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 59).addBox(3.4488F, -1.651F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.1529F, -0.5117F, 0.545F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(77, 47).addBox(4.0708F, -3.9804F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.125F, -0.5186F, 1.0982F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.8982F, -0.357F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5271F, -3.9408F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.05F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(56, 83).addBox(0.5F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4741F, -1.024F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(5, 92).addBox(0.5F, -1.975F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5043F, -3.0263F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(-7.0724F, -3.9792F, -0.3719F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, -0.1324F, 0.5024F, -1.0835F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(61, 78).mirror().addBox(-5.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, 0.137F, 0.5012F, -0.5344F));

		PartDefinition cube_r101 = Bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-3.8243F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, 0.347F, 0.4021F, -0.0609F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 48).mirror().addBox(-7.0724F, -3.9792F, -0.3719F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, -0.1324F, 0.5024F, -1.0835F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-5.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, 0.137F, 0.5012F, -0.5344F));

		PartDefinition cube_r104 = Bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(62, 4).mirror().addBox(-3.8243F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, 0.347F, 0.4021F, -0.0609F));

		PartDefinition cube_r105 = Bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(55, 69).addBox(4.0724F, -3.9792F, -0.3719F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, -0.1324F, -0.5024F, 1.0835F));

		PartDefinition cube_r106 = Bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(61, 78).addBox(3.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, 0.137F, -0.5012F, 0.5344F));

		PartDefinition cube_r107 = Bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 14).addBox(-0.1757F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, 0.347F, -0.4021F, 0.0609F));

		PartDefinition cube_r108 = Bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(68, 48).addBox(4.0724F, -3.9792F, -0.3719F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, -0.1324F, -0.5024F, 1.0835F));

		PartDefinition cube_r109 = Bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 73).addBox(3.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, 0.137F, -0.5012F, 0.5344F));

		PartDefinition cube_r110 = Bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 4).addBox(-0.1757F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, 0.347F, -0.4021F, 0.0609F));

		PartDefinition cube_r111 = Bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 7).addBox(-4.0F, -0.8793F, -3.1417F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1499F, 0.9752F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 44).addBox(0.0F, -0.6F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3522F, 0.0821F, -2.9325F, 0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(60, 63).mirror().addBox(-8.0871F, -3.9673F, -0.3933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, -0.1177F, 0.5349F, -1.0946F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(54, 29).mirror().addBox(-3.8236F, -0.018F, -0.4214F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, 0.3844F, 0.408F, -0.0645F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-5.4572F, -1.6318F, -0.3933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, 0.169F, 0.5222F, -0.5371F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(60, 63).addBox(4.0871F, -3.9673F, -0.3933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, -0.1177F, -0.5349F, 1.0946F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(11, 58).addBox(0.0F, -0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8522F, 0.2118F, -3.0178F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(78, 81).addBox(0.5F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8522F, -0.4227F, -2.0394F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(54, 29).addBox(-0.1764F, -0.018F, -0.4214F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, 0.3844F, -0.408F, 0.0645F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(78, 71).addBox(3.4572F, -1.6318F, -0.3933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, 0.169F, -0.5222F, 0.5371F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8522F, 0.1057F, -2.9682F, 0.0926F, 0.0177F, -0.0729F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-5.4567F, -1.6329F, -0.3903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, 0.0451F, 0.4362F, -0.5907F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(9, 63).mirror().addBox(-8.0861F, -3.968F, -0.3903F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.1737F, 0.4045F, -1.1164F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-8.0933F, -3.9619F, -0.4019F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, -0.1603F, 0.4372F, -1.1118F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 5).mirror().addBox(-3.823F, -0.0098F, -0.43F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, 0.2728F, 0.3888F, -0.1052F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-5.4602F, -1.6242F, -0.4019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, 0.0751F, 0.4582F, -0.5786F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(57, 49).mirror().addBox(-3.8236F, -0.0191F, -0.4184F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, 0.236F, 0.3815F, -0.1181F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(73, 4).addBox(3.4567F, -1.6329F, -0.3903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, 0.0451F, -0.4362F, 0.5907F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(9, 63).addBox(4.0861F, -3.968F, -0.3903F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.1737F, -0.4045F, 1.1164F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 10).addBox(4.0933F, -3.9619F, -0.4019F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, -0.1603F, -0.4372F, 1.1118F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(25, 5).addBox(-0.177F, -0.0098F, -0.43F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, 0.2728F, -0.3888F, 0.1052F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(79, 32).addBox(3.4602F, -1.6242F, -0.4019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, 0.0751F, -0.4582F, 0.5786F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(81, 81).addBox(0.5F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4647F, -1.0203F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(59, 80).addBox(0.5F, -2.35F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3949F, -3.0191F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(57, 49).addBox(-0.1764F, -0.0191F, -0.4184F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, 0.236F, -0.3815F, 0.1181F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 49).addBox(0.0F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1256F, -3.901F, -0.061F, -0.0024F, -0.0785F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(62, 80).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4251F, -1.0179F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-5.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, 0.1057F, 0.4799F, -0.5831F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(69, 59).mirror().addBox(-3.822F, 0.0015F, -0.4451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, 0.3098F, 0.3956F, -0.1094F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(71, 22).mirror().addBox(-7.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, -0.1465F, 0.4698F, -1.1241F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(-5.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, 0.1057F, 0.4799F, -0.5831F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(-7.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, -0.1465F, 0.4698F, -1.1241F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-3.822F, 0.0015F, -0.4451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, 0.3098F, 0.3956F, -0.1094F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 22).addBox(4.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, -0.1465F, -0.4698F, 1.1241F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(69, 59).addBox(0.822F, 0.0015F, -0.4451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, 0.3098F, -0.3956F, 0.1094F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 79).addBox(3.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, 0.1057F, -0.4799F, 0.5831F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 75).addBox(3.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, 0.1057F, -0.4799F, 0.5831F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(64, 57).addBox(4.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, -0.1465F, -0.4698F, 1.1241F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(60, 12).addBox(-0.178F, 0.0015F, -0.4451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, 0.3098F, -0.3956F, 0.1094F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 82).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3553F, -3.0167F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(41, 32).addBox(0.0F, -0.6F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 5.6388F, -1.1575F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r151 = bone.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(7, 72).addBox(0.6716F, -0.7101F, -4.0443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.3309F, 0.1303F, -0.3504F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(51, 59).addBox(-0.2241F, -0.7101F, -4.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 39).addBox(-0.2241F, -0.7101F, -2.4369F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 64).addBox(-0.1991F, -0.7101F, 0.0631F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.329F, -0.0762F, -0.2798F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 21).addBox(1.7779F, -0.6556F, 2.6272F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.346F, -0.4484F, -0.1493F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(49, 11).addBox(-0.1991F, -0.6468F, 1.9469F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.3115F, -0.0762F, -0.2798F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(63, 65).addBox(0.4936F, -0.6468F, 4.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.3342F, 0.3715F, -0.4298F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(56, 65).addBox(1.7238F, -0.6468F, 4.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.3111F, 0.0567F, -0.3226F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(42, 0).addBox(-0.2298F, -0.7101F, 1.5648F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.328F, 0.0147F, -0.3108F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(53, 0).addBox(-1.0037F, -0.7101F, 0.6677F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.5343F, 0.8858F, -0.7355F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(22, 51).addBox(-0.825F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6631F, -0.6505F, 1.4549F, -0.3722F, 0.5555F, -0.469F));

		PartDefinition cube_r160 = bone.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 0).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -1.8303F, 0.1276F, 0.3069F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(17, 78).addBox(-0.2592F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -0.8849F, 0.0312F, 0.3302F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(78, 14).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -0.9576F, 0.1276F, 0.3069F));

		PartDefinition cube_r163 = bone.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 77).addBox(-0.5F, -1.4485F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8311F, -1.8231F, -0.3867F, 0.3356F, 0.4019F, 1.3942F));

		PartDefinition cube_r164 = bone.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(20, 64).addBox(-0.5F, -1.1817F, -1.3514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.8311F, -1.8231F, -0.3867F, 0.7719F, 0.4019F, 1.3942F));

		PartDefinition cube_r165 = bone.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(38, 20).addBox(1.1195F, -0.2892F, -4.3124F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.4272F, -0.353F, -0.2454F));

		PartDefinition cube_r166 = bone.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 55).addBox(-3.7614F, 0.2204F, -5.1048F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.9875F, -0.8881F, 0.4418F));

		PartDefinition cube_r167 = bone.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 27).addBox(-4.3646F, 0.2204F, -2.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(64, 69).addBox(-4.8303F, 0.2204F, -4.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -1.1955F, -0.9692F, 0.7008F));

		PartDefinition cube_r168 = bone.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(90, 3).addBox(-3.5125F, 0.2204F, -4.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9438F, -0.8042F, -0.7509F, 0.1921F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 5.6388F, -1.1575F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r169 = bone11.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-1.6716F, -0.7101F, -4.0443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.3309F, -0.1303F, 0.3504F));

		PartDefinition cube_r170 = bone11.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(51, 59).mirror().addBox(-0.7759F, -0.7101F, -4.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 39).mirror().addBox(-2.7759F, -0.7101F, -2.4369F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(0, 64).mirror().addBox(-1.8009F, -0.7101F, 0.0631F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.329F, 0.0762F, 0.2798F));

		PartDefinition cube_r171 = bone11.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(51, 21).mirror().addBox(-4.7779F, -0.6556F, 2.6272F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.346F, 0.4484F, 0.1493F));

		PartDefinition cube_r172 = bone11.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(-1.8009F, -0.6468F, 1.9469F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.3115F, 0.0762F, 0.2798F));

		PartDefinition cube_r173 = bone11.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 65).mirror().addBox(-1.4936F, -0.6468F, 4.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.3342F, -0.3715F, 0.4298F));

		PartDefinition cube_r174 = bone11.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(56, 65).mirror().addBox(-2.7239F, -0.6468F, 4.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.3111F, -0.0567F, 0.3226F));

		PartDefinition cube_r175 = bone11.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.7702F, -0.7101F, 1.5648F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.328F, -0.0147F, 0.3108F));

		PartDefinition cube_r176 = bone11.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-1.9963F, -0.7101F, 0.6677F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.5343F, -0.8858F, 0.7355F));

		PartDefinition cube_r177 = bone11.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(22, 51).mirror().addBox(-1.175F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6631F, -0.6505F, 1.4549F, -0.3722F, -0.5555F, 0.469F));

		PartDefinition cube_r178 = bone11.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -1.8303F, -0.1276F, -0.3069F));

		PartDefinition cube_r179 = bone11.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(17, 78).mirror().addBox(-0.7408F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -0.8849F, -0.0312F, -0.3302F));

		PartDefinition cube_r180 = bone11.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -0.9576F, -0.1276F, -0.3069F));

		PartDefinition cube_r181 = bone11.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(-0.5F, -1.4485F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8311F, -1.8231F, -0.3867F, 0.3356F, -0.4019F, -1.3942F));

		PartDefinition cube_r182 = bone11.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-0.5F, -1.1817F, -1.3514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.8311F, -1.8231F, -0.3867F, 0.7719F, -0.4019F, -1.3942F));

		PartDefinition cube_r183 = bone11.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 20).mirror().addBox(-4.1195F, -0.2892F, -4.3124F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.4272F, 0.353F, 0.2454F));

		PartDefinition cube_r184 = bone11.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(0.7614F, 0.2204F, -5.1048F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.9875F, 0.8881F, -0.4418F));

		PartDefinition cube_r185 = bone11.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 27).mirror().addBox(3.3646F, 0.2204F, -2.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 69).mirror().addBox(3.8303F, 0.2204F, -4.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -1.1955F, 0.9692F, -0.7008F));

		PartDefinition cube_r186 = bone11.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(90, 3).mirror().addBox(2.5125F, 0.2204F, -4.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9438F, -0.8042F, 0.7509F, -0.1921F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8163F, 4.6625F, -0.3391F, 0.2927F, 0.0308F, -0.5231F));

		PartDefinition cube_r187 = FrontFlipperR3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(23, 71).addBox(-0.124F, -0.5F, 0.0049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.2091F, -0.0709F, -2.912F, 0.0F, -0.6458F, 0.0F));

		PartDefinition cube_r188 = FrontFlipperR3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(71, 18).addBox(-0.1F, -0.5F, -2.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(4.8091F, -0.0709F, -0.762F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r189 = FrontFlipperR3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(65, 24).addBox(1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.3144F, -0.0709F, 2.4121F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r190 = FrontFlipperR3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(29, 63).addBox(-1.5F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.6057F, -0.0709F, -0.6868F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r191 = FrontFlipperR3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0143F, -0.5F, -3.0342F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.2674F, -0.0709F, -0.6098F, 0.0F, 1.1519F, 0.0F));

		PartDefinition cube_r192 = FrontFlipperR3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(71, 71).addBox(-0.9977F, -0.5F, -2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7698F, -0.0709F, 1.2988F, 0.0F, -1.2566F, 0.0F));

		PartDefinition cube_r193 = FrontFlipperR3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(90, 9).addBox(-0.4349F, -0.5F, 0.0001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(89, 44).addBox(-0.4349F, -0.5F, 0.7001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3337F, -0.0709F, -0.4351F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r194 = FrontFlipperR3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(62, 73).addBox(-2.0F, -0.5F, 0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2689F, -0.0709F, -1.0598F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r195 = FrontFlipperR3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(44, 73).addBox(-0.725F, -0.5F, 0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.3771F, -0.0709F, -0.5717F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r196 = FrontFlipperR3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(11, 55).addBox(-1.575F, -0.5F, -0.575F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4072F, -0.0709F, -0.4763F, 0.0F, 0.6545F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5858F, -0.0709F, -0.8442F, -0.045F, 0.123F, -0.3518F));

		PartDefinition cube_r197 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(89, 80).addBox(-2.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3469F, 0.0F, -1.5308F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r198 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 90).addBox(-0.0096F, -0.5F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3306F, 0.0F, -0.4501F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r199 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(74, 89).addBox(-0.625F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0556F, 0.0F, -0.4251F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r200 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(75, 39).addBox(-1.7713F, -0.5F, -0.8302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.609F, 0.0F, -0.3376F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r201 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(35, 90).addBox(-3.1F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 90).addBox(-2.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1371F, 0.0F, 0.2235F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r202 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(20, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7687F, 0.0F, 0.9612F, 0.0F, 1.3526F, 0.0F));

		PartDefinition cube_r203 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(15, 90).addBox(-0.7F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.1124F, 0.0F, 0.964F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r204 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 67).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.6175F, 0.0F, 2.1661F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r205 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(21, 75).addBox(-1.4181F, -0.5F, -2.0855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0155F, 0.0F, 2.2104F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r206 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(92, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.9109F, 0.0F, 1.0547F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r207 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(59, 91).addBox(-0.675F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.926F, 0.0F, 0.5391F, 0.0F, 0.6283F, 0.0F));

		PartDefinition cube_r208 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(89, 64).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.2671F, 0.0F, -0.0385F, 0.0F, -0.9425F, 0.0F));

		PartDefinition cube_r209 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(51, 89).addBox(-0.55F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.142F, 0.0F, 2.7899F, 0.0F, 0.8901F, 0.0F));

		PartDefinition cube_r210 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(34, 12).addBox(-0.0072F, 1.0312F, 0.002F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6351F, -0.9941F, 0.1311F, -0.0004F, -0.3487F, 0.0081F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2328F, 0.0772F, 1.237F, 0.1812F, -0.1209F, -0.3957F));

		PartDefinition cube_r211 = FrontFlipperEndR3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 21).addBox(-0.0476F, 1.0572F, 0.0308F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2057F, -1.0713F, 0.2053F, -0.0083F, -0.5239F, 0.0008F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8163F, 4.6625F, -0.3391F, -0.2309F, -0.0308F, 0.5231F));

		PartDefinition cube_r212 = FrontFlipperR2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(71, 61).addBox(-0.876F, -0.5F, 0.0049F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-4.2091F, -0.0709F, -2.912F, 0.0F, 0.6458F, 0.0F));

		PartDefinition cube_r213 = FrontFlipperR2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(55, 71).addBox(-0.9F, -0.5F, -2.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-4.8091F, -0.0709F, -0.762F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r214 = FrontFlipperR2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(65, 27).addBox(-4.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.3144F, -0.0709F, 2.4121F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r215 = FrontFlipperR2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(38, 63).addBox(-0.5F, -0.5F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-5.6057F, -0.0709F, -0.6868F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r216 = FrontFlipperR2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(51, 16).addBox(0.0143F, -0.5F, -3.0342F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.2674F, -0.0709F, -0.6098F, 0.0F, -1.1519F, 0.0F));

		PartDefinition cube_r217 = FrontFlipperR2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(72, 30).addBox(-0.0023F, -0.5F, -2.0024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.7698F, -0.0709F, 1.2988F, 0.0F, 1.2566F, 0.0F));

		PartDefinition cube_r218 = FrontFlipperR2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(90, 54).addBox(-0.5651F, -0.5F, 0.0001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(90, 51).addBox(-0.5651F, -0.5F, 0.7001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3337F, -0.0709F, -0.4351F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r219 = FrontFlipperR2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 74).addBox(0.0F, -0.5F, 0.225F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2689F, -0.0709F, -1.0598F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r220 = FrontFlipperR2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(73, 53).addBox(-1.275F, -0.5F, 0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.3771F, -0.0709F, -0.5717F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r221 = FrontFlipperR2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(55, 51).addBox(-2.425F, -0.5F, -0.575F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.4072F, -0.0709F, -0.4763F, 0.0F, -0.6545F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5858F, -0.0709F, -0.8442F, -0.0503F, -0.1209F, 0.3957F));

		PartDefinition cube_r222 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(91, 24).addBox(1.3F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3469F, 0.0F, -1.5308F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r223 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(91, 21).addBox(-0.9904F, -0.5F, -1.0158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3306F, 0.0F, -0.4501F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r224 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 18).addBox(-0.375F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0556F, 0.0F, -0.4251F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r225 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(51, 75).addBox(-0.2287F, -0.5F, -0.8302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.609F, 0.0F, -0.3376F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r226 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(89, 90).addBox(2.1F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 90).addBox(1.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 90).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.1371F, 0.0F, 0.2235F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r227 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(90, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7687F, 0.0F, 0.9612F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r228 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(90, 70).addBox(-0.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.1124F, 0.0F, 0.964F, 0.0F, -1.2654F, 0.0F));

		PartDefinition cube_r229 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(66, 90).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6175F, 0.0F, 2.1661F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r230 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(75, 50).addBox(-0.5819F, -0.5F, -2.0855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.0155F, 0.0F, 2.2104F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r231 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(40, 92).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.9109F, 0.0F, 1.0547F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r232 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 76).addBox(-0.325F, -0.5F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.926F, 0.0F, 0.5391F, 0.0F, -0.6283F, 0.0F));

		PartDefinition cube_r233 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(90, 60).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.2671F, 0.0F, -0.0385F, 0.0F, 0.9425F, 0.0F));

		PartDefinition cube_r234 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(90, 57).addBox(-0.45F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.142F, 0.0F, 2.7899F, 0.0F, -0.8901F, 0.0F));

		PartDefinition cube_r235 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(34, 16).addBox(-3.9928F, 1.0312F, 0.002F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6351F, -0.9941F, 0.1311F, -0.0004F, 0.3487F, -0.0081F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2328F, 0.0772F, 1.237F, 0.1705F, 0.1248F, 0.3079F));

		PartDefinition cube_r236 = FrontFlipperEndR2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(19, 21).addBox(-5.9524F, 1.0572F, 0.0308F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2057F, -1.0713F, 0.2053F, -0.0083F, 0.5239F, -0.0008F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4296F, -3.9864F, -0.3052F, -0.272F, -0.0451F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(71, 90).addBox(0.5F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4101F, -3.0251F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(20, 82).addBox(0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6538F, -1.04F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(94, 83).mirror().addBox(-2.454F, 0.0567F, -0.2941F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4228F, -0.0103F, -3.2454F, 0.4696F, 0.3753F, -0.2191F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(94, 90).mirror().addBox(-3.2465F, -0.9852F, -0.2759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4228F, -0.0103F, -3.2454F, 0.2672F, 0.5282F, -0.6749F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(66, 51).mirror().addBox(-2.454F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.438F, 0.476F, -0.2845F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(58, 76).mirror().addBox(-4.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.1826F, 0.6049F, -0.7727F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(94, 90).addBox(2.2465F, -0.9852F, -0.2759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4228F, -0.0103F, -3.2454F, 0.2672F, -0.5282F, 0.6749F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(94, 83).addBox(1.454F, 0.0567F, -0.2941F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4228F, -0.0103F, -3.2454F, 0.4696F, -0.3753F, 0.2191F));

		PartDefinition cube_r245 = neck.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(66, 51).addBox(-0.546F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.438F, -0.476F, 0.2845F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(58, 76).addBox(2.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.1826F, -0.6049F, 0.7727F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(13, 43).addBox(0.0F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0874F, -4.0727F, -0.0396F, -0.1221F, 0.0048F));

		PartDefinition cube_r248 = Neck1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(48, 82).addBox(0.5F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2663F, -0.9102F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Neck1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(23, 82).addBox(0.5F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0226F, -2.8953F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r250 = Neck1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-2.6975F, 0.1674F, -0.4397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.4777F, -2.464F, 0.2585F, 0.3495F, -0.6403F));

		PartDefinition cube_r251 = Neck1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-1.8975F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -0.2639F, 0.4263F, 0.3913F, -0.6739F));

		PartDefinition cube_r252 = Neck1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(34, 67).addBox(-0.3025F, 0.1674F, -0.4397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.4777F, -2.464F, 0.2585F, -0.3495F, 0.6403F));

		PartDefinition cube_r253 = Neck1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 77).addBox(-0.1025F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -0.2639F, 0.4263F, -0.3913F, 0.6739F));

		PartDefinition cube_r254 = Neck1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(43, 25).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, -0.097F, -0.06F, -0.0327F));

		PartDefinition cube_r255 = Neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(82, 93).addBox(0.0F, -1.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5919F, -0.6087F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(79, 93).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.557F, -2.6084F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Neck2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-2.1475F, 0.0924F, -0.5397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1027F, -2.0639F, 0.0966F, 0.0883F, -0.6838F));

		PartDefinition cube_r258 = Neck2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 67).mirror().addBox(-2.2975F, 0.1674F, -0.5397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -0.0639F, 0.1799F, 0.1821F, -0.6685F));

		PartDefinition cube_r259 = Neck2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 68).addBox(-0.8525F, 0.0924F, -0.5397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1027F, -2.0639F, 0.0966F, -0.0883F, 0.6838F));

		PartDefinition cube_r260 = Neck2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 67).addBox(-0.7025F, 0.1674F, -0.5397F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -0.0639F, 0.1799F, -0.1821F, 0.6685F));

		PartDefinition cube_r261 = Neck2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 44).addBox(0.0F, -0.4F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(24, 45).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(85, 93).addBox(0.0F, -1.775F, -3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, -0.1626F, -0.1079F, -0.1139F));

		PartDefinition cube_r262 = Neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(93, 86).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-1.8475F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0758F, -0.0067F, -0.863F));

		PartDefinition cube_r264 = Neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-1.9975F, -0.0076F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.111F, 0.1009F, -0.8133F));

		PartDefinition cube_r265 = Neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(77, 67).addBox(-0.1525F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0758F, 0.0067F, 0.863F));

		PartDefinition cube_r266 = Neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(77, 65).addBox(-0.0025F, -0.0076F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.111F, -0.1009F, 0.8133F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(35, 45).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(91, 93).addBox(0.0F, -1.75F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.0963F, -0.1231F, -0.0682F));

		PartDefinition cube_r267 = Neck4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(88, 93).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Neck4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-1.7975F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0375F, -0.0949F, -0.7793F));

		PartDefinition cube_r269 = Neck4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(78, 61).mirror().addBox(-1.7225F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0966F, -0.0635F, -0.8301F));

		PartDefinition cube_r270 = Neck4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(78, 10).addBox(-0.2025F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0375F, 0.0949F, 0.7793F));

		PartDefinition cube_r271 = Neck4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(78, 61).addBox(-0.2775F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0966F, 0.0635F, 0.8301F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(46, 45).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0715F, -0.3371F, -0.0809F));

		PartDefinition cube_r272 = Neck5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(59, 94).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Neck5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(94, 43).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Neck5.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(54, 78).mirror().addBox(-1.4975F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.029F, -0.0542F, -0.6904F));

		PartDefinition cube_r275 = Neck5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-1.7975F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0969F, -0.1115F, -0.7031F));

		PartDefinition cube_r276 = Neck5.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(54, 78).addBox(-0.5025F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.029F, 0.0542F, 0.6904F));

		PartDefinition cube_r277 = Neck5.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(78, 63).addBox(-0.2025F, 0.0674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0969F, 0.1115F, 0.7031F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.5F, -5.95F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0617F, -0.2662F, -0.0645F));

		PartDefinition cube_r278 = Neck6.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(46, 95).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r279 = Neck6.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(49, 95).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Neck6.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(43, 95).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Neck6.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6636F, 0.5257F, -4.5252F, 0.029F, -0.0106F, -0.6891F));

		PartDefinition cube_r282 = Neck6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(94, 32).mirror().addBox(-1.1225F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r283 = Neck6.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-1.2475F, 0.1674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0969F, -0.1115F, -0.7031F));

		PartDefinition cube_r284 = Neck6.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(94, 63).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6636F, 0.5257F, -4.5252F, 0.029F, 0.0106F, 0.6891F));

		PartDefinition cube_r285 = Neck6.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(94, 32).addBox(0.1225F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r286 = Neck6.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(78, 12).addBox(-0.7525F, 0.1674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0969F, 0.1115F, 0.7031F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(68, 39).addBox(-0.5F, -0.7066F, -4.8076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.475F, -5.475F, -0.0002F, -0.0708F, -0.1011F));

		PartDefinition cube_r287 = Head.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(71, 14).addBox(-0.5F, -0.375F, -1.925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(0.0F, -0.8576F, -0.5105F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r288 = Head.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(41, 69).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.8576F, -0.5105F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Head.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(28, 32).addBox(-0.5F, -0.775F, -4.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, 0.4213F, -0.4283F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r290 = Head.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(34, 69).addBox(-0.5F, -0.35F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6847F, -1.9284F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r291 = Head.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(85, 71).addBox(-0.5374F, -0.3429F, -0.3568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0374F, -0.2162F, -5.8615F, -0.1876F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Head.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(64, 85).addBox(-0.5374F, -0.3429F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0374F, -0.406F, -5.6292F, 0.685F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Head.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(85, 61).addBox(-0.5374F, -0.2429F, -0.7567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0374F, -0.5291F, -5.1445F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Head.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(82, 49).addBox(-0.5374F, -0.299F, -0.8044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0374F, -0.5041F, -4.5945F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Head.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(82, 38).addBox(-0.5F, -0.1455F, -0.8578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7621F, -2.9891F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r296 = Head.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(9, 68).addBox(-0.5F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -0.45F, -2.125F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6272F, 0.3821F, -2.5955F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(89, 32).addBox(-0.675F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1798F, -0.3087F, -3.4557F, -0.2109F, 0.6058F, -0.0732F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(84, 68).addBox(-0.475F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)), PartPose.offsetAndRotation(-0.9589F, -0.6463F, -1.3036F, -0.0044F, -0.3247F, 0.7901F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(41, 86).addBox(-0.625F, -0.25F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(86, 29).addBox(-0.625F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.0399F, -0.3436F, -3.2709F, 0.5198F, 0.1291F, 1.4789F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(27, 81).addBox(-0.75F, -0.25F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F))
				.texOffs(81, 25).addBox(-0.75F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.4127F, -0.0578F, -1.9433F, 0.3729F, 0.2273F, 1.5367F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(71, 6).addBox(-0.25F, -0.25F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.0206F, -0.2091F, -0.3205F, 0.2508F, 0.2273F, 1.5367F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(86, 77).addBox(-0.75F, -0.25F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F))
				.texOffs(51, 86).addBox(-0.75F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2493F)), PartPose.offsetAndRotation(-0.4272F, -0.49F, -1.8423F, -0.0181F, 0.4707F, 0.5467F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(70, 65).addBox(0.05F, -0.25F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2494F)), PartPose.offsetAndRotation(-1.1269F, -0.9227F, -1.7857F, -0.017F, 0.3136F, 0.5497F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(16, 69).addBox(-0.25F, -0.25F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1269F, -0.9227F, -1.7857F, -0.0162F, -0.079F, 0.5562F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(78, 18).addBox(-0.675F, -1.725F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3278F, -1.1043F, -0.507F, 1.8021F, 0.3233F, -1.4674F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(78, 6).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3267F, -0.9905F, 0.0346F, 1.552F, 0.1154F, -1.4938F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(86, 26).addBox(-0.4763F, -0.5314F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.075F, -0.9805F, 0.5752F, 0.8598F, 0.1245F, -1.339F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(81, 22).addBox(-0.4212F, -0.8608F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.075F, -0.9805F, 0.5752F, 0.816F, 0.3327F, -1.5305F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(45, 90).addBox(-0.4411F, -0.5611F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2199F, -1.1537F, 0.902F, -0.6738F, 0.499F, -1.7394F));

		PartDefinition cube_r310 = bone3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(90, 40).addBox(-0.3661F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.2199F, -1.1537F, 0.902F, 0.6508F, 0.71F, -1.3341F));

		PartDefinition cube_r311 = bone3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(90, 0).addBox(-0.3661F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-0.8508F, -1.1959F, 1.0504F, 0.5112F, 0.71F, -1.3341F));

		PartDefinition cube_r312 = bone3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(84, 65).addBox(-0.4125F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 45).addBox(-0.5375F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.6487F, -0.6948F, 0.0643F, 0.0677F, 0.2779F, -0.1182F));

		PartDefinition cube_r313 = bone3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 90).addBox(-0.3661F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4609F, -1.1793F, 1.1381F, 0.293F, 0.71F, -1.3341F));

		PartDefinition cube_r314 = bone3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(5, 89).addBox(-0.4866F, -0.6324F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2645F, -1.1616F, 1.1716F, 0.5242F, 0.5466F, -0.8307F));

		PartDefinition cube_r315 = bone3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(36, 84).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0584F, -0.6774F, 1.2401F, 0.2995F, 0.081F, -0.1623F));

		PartDefinition cube_r316 = bone3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(88, 87).addBox(-0.4964F, -0.2437F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0337F, -0.6471F, 1.6478F, 1.501F, -0.0378F, -0.0529F));

		PartDefinition cube_r317 = bone3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(61, 88).addBox(-0.503F, -0.6214F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.0337F, -0.6471F, 1.6478F, 1.5009F, 0.0667F, -0.0602F));

		PartDefinition cube_r318 = bone3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(89, 83).addBox(-0.465F, -0.7504F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0837F, -0.6471F, 1.6478F, 1.1606F, 0.0697F, -0.0567F));

		PartDefinition cube_r319 = bone3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(84, 34).addBox(-0.2367F, -0.3978F, -0.8963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.4395F, -1.1116F, 1.4466F, 0.6205F, 0.3262F, -0.4783F));

		PartDefinition cube_r320 = bone3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(85, 74).addBox(-0.5F, -0.375F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(-0.1278F, 0.4695F, 2.4F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r321 = bone3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(31, 84).addBox(-0.5F, -0.3F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(26, 84).addBox(-0.5F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1278F, 1.0284F, 2.4573F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r322 = bone3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(74, 77).addBox(-0.55F, -1.15F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8118F, -0.8743F, 2.3477F, 0.2875F, 0.068F, -1.053F));

		PartDefinition cube_r323 = bone3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(10, 84).addBox(-0.4974F, -0.2708F, -0.4949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2054F, -0.155F, 2.4235F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r324 = bone3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5052F, -0.8541F, -0.8802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.2049F, -0.2222F, 2.821F, 0.1828F, -0.0007F, 0.0114F));

		PartDefinition cube_r325 = bone3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 83).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1865F, -0.0639F, 2.0605F, -0.87F, 0.0148F, -0.0185F));

		PartDefinition cube_r326 = bone3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -0.85F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2028F, -0.0292F, 1.2237F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r327 = bone3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(86, 23).addBox(-0.5F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2028F, -0.6344F, 0.9644F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r328 = bone3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(86, 20).addBox(-0.8555F, -0.8498F, -0.886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1527F, -0.0799F, 1.435F, 0.6196F, 0.0524F, 0.0F));

		PartDefinition cube_r329 = bone3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(42, 83).addBox(-0.8868F, -0.4033F, -1.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1527F, -0.0799F, 1.435F, -0.0169F, 0.0174F, -0.0065F));

		PartDefinition cube_r330 = bone3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(83, 17).addBox(-0.7374F, -0.2348F, -2.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1527F, -0.0799F, 1.435F, -0.1567F, 0.1396F, -0.0086F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(12, 81).addBox(0.305F, -0.1922F, -0.6364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9473F, 0.3201F, 0.735F, 0.1161F, 0.0326F, -0.325F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(83, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.0938F, 0.3627F, 0.0181F, -0.2024F, 0.1667F, -0.4326F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(83, 6).addBox(0.4404F, 0.1357F, -1.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 83).addBox(0.4404F, 0.2607F, -2.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9473F, 0.3201F, 0.735F, -0.2897F, 0.1667F, -0.4326F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(44, 76).addBox(-0.525F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3116F, -0.4856F, -3.0833F, -0.7164F, 0.5235F, -0.8056F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(7, 76).addBox(-0.625F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8663F, -0.4479F, -2.5829F, -0.4269F, 0.1487F, -0.4728F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(33, 77).addBox(-0.575F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6897F, -0.2862F, -2.0328F, -0.3892F, 0.134F, -0.5144F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(12, 77).addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.5131F, -0.1245F, -1.4826F, -0.4206F, 0.1667F, -0.4326F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(68, 82).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0797F, -0.5234F, -1.0788F, 0.1014F, 0.1291F, -0.9817F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(38, 77).addBox(-0.507F, -0.5156F, -0.7126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.846F, -0.537F, -0.7401F, 1.0558F, 0.0791F, -0.866F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.62F, -0.3936F, -4.0547F));

		PartDefinition bone7 = Head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6272F, 0.3821F, -2.5955F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r340 = bone7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(89, 32).mirror().addBox(-0.325F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1798F, -0.3087F, -3.4557F, -0.2109F, -0.6058F, 0.0732F));

		PartDefinition cube_r341 = bone7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(84, 68).mirror().addBox(-0.525F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)).mirror(false), PartPose.offsetAndRotation(0.9589F, -0.6463F, -1.3036F, -0.0044F, 0.3247F, -0.7901F));

		PartDefinition cube_r342 = bone7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(41, 86).mirror().addBox(-0.375F, -0.25F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(86, 29).mirror().addBox(-0.375F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(1.0399F, -0.3436F, -3.2709F, 0.5198F, -0.1291F, -1.4789F));

		PartDefinition cube_r343 = bone7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(27, 81).mirror().addBox(-0.25F, -0.25F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false)
				.texOffs(81, 25).mirror().addBox(-0.25F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.4127F, -0.0578F, -1.9433F, 0.3729F, -0.2273F, -1.5367F));

		PartDefinition cube_r344 = bone7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(71, 6).mirror().addBox(-0.75F, -0.25F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.0206F, -0.2091F, -0.3205F, 0.2508F, -0.2273F, -1.5367F));

		PartDefinition cube_r345 = bone7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(86, 77).mirror().addBox(-0.25F, -0.25F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false)
				.texOffs(51, 86).mirror().addBox(-0.25F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2493F)).mirror(false), PartPose.offsetAndRotation(0.4272F, -0.49F, -1.8423F, -0.0181F, -0.4707F, -0.5467F));

		PartDefinition cube_r346 = bone7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-1.05F, -0.25F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2494F)).mirror(false), PartPose.offsetAndRotation(1.1269F, -0.9227F, -1.7857F, -0.017F, -0.3136F, -0.5497F));

		PartDefinition cube_r347 = bone7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-0.75F, -0.25F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(1.1269F, -0.9227F, -1.7857F, -0.0162F, 0.079F, -0.5562F));

		PartDefinition cube_r348 = bone7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.325F, -1.725F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3278F, -1.1043F, -0.507F, 1.8021F, -0.3233F, 1.4674F));

		PartDefinition cube_r349 = bone7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3267F, -0.9905F, 0.0346F, 1.552F, -0.1154F, 1.4938F));

		PartDefinition cube_r350 = bone7.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.5237F, -0.5314F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.075F, -0.9805F, 0.5752F, 0.8598F, -0.1245F, 1.339F));

		PartDefinition cube_r351 = bone7.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-0.5788F, -0.8608F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.075F, -0.9805F, 0.5752F, 0.816F, -0.3327F, 1.5305F));

		PartDefinition cube_r352 = bone7.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(45, 90).mirror().addBox(-0.5589F, -0.5611F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2199F, -1.1537F, 0.902F, -0.6738F, -0.499F, 1.7394F));

		PartDefinition cube_r353 = bone7.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.6339F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(1.2199F, -1.1537F, 0.902F, 0.6508F, -0.71F, 1.3341F));

		PartDefinition cube_r354 = bone7.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.6339F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(0.8508F, -1.1959F, 1.0504F, 0.5112F, -0.71F, 1.3341F));

		PartDefinition cube_r355 = bone7.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-0.5875F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 45).mirror().addBox(-0.4625F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.6487F, -0.6948F, 0.0643F, 0.0677F, -0.2779F, 0.1182F));

		PartDefinition cube_r356 = bone7.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.6339F, -0.7111F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4609F, -1.1793F, 1.1381F, 0.293F, -0.71F, 1.3341F));

		PartDefinition cube_r357 = bone7.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(5, 89).mirror().addBox(-0.5134F, -0.6324F, -0.717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2645F, -1.1616F, 1.1716F, 0.5242F, -0.5466F, 0.8307F));

		PartDefinition cube_r358 = bone7.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(36, 84).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0584F, -0.6774F, 1.2401F, 0.2995F, -0.081F, 0.1623F));

		PartDefinition cube_r359 = bone7.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(-0.5036F, -0.2437F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0337F, -0.6471F, 1.6478F, 1.501F, 0.0378F, 0.0529F));

		PartDefinition cube_r360 = bone7.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(61, 88).mirror().addBox(-0.497F, -0.6214F, -0.5149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.0337F, -0.6471F, 1.6478F, 1.5009F, -0.0667F, 0.0602F));

		PartDefinition cube_r361 = bone7.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(89, 83).mirror().addBox(-0.535F, -0.7504F, -0.5203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0837F, -0.6471F, 1.6478F, 1.1606F, -0.0697F, 0.0567F));

		PartDefinition cube_r362 = bone7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(84, 34).mirror().addBox(-0.7633F, -0.3978F, -0.8963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.4395F, -1.1116F, 1.4466F, 0.6205F, -0.3262F, 0.4783F));

		PartDefinition cube_r363 = bone7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(85, 74).mirror().addBox(-0.5F, -0.375F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(0.1278F, 0.4695F, 2.4F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r364 = bone7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(31, 84).mirror().addBox(-0.5F, -0.3F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(26, 84).mirror().addBox(-0.5F, -0.3F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1278F, 1.0284F, 2.4573F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone7.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-0.45F, -1.15F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8118F, -0.8743F, 2.3477F, 0.2875F, -0.068F, 1.053F));

		PartDefinition cube_r366 = bone7.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.5026F, -0.2708F, -0.4949F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2054F, -0.155F, 2.4235F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r367 = bone7.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.4948F, -0.8541F, -0.8802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.2049F, -0.2222F, 2.821F, 0.1828F, 0.0007F, -0.0114F));

		PartDefinition cube_r368 = bone7.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(51, 83).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1865F, -0.0639F, 2.0605F, -0.87F, -0.0148F, 0.0185F));

		PartDefinition cube_r369 = bone7.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.5F, -0.85F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.0292F, 1.2237F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r370 = bone7.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(86, 23).mirror().addBox(-0.5F, -0.125F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.6344F, 0.9644F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r371 = bone7.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-0.1445F, -0.8498F, -0.886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1527F, -0.0799F, 1.435F, 0.6196F, -0.0524F, 0.0F));

		PartDefinition cube_r372 = bone7.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(42, 83).mirror().addBox(-0.1132F, -0.4033F, -1.4255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1527F, -0.0799F, 1.435F, -0.0169F, -0.0174F, 0.0065F));

		PartDefinition cube_r373 = bone7.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-0.2626F, -0.2348F, -2.0425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1527F, -0.0799F, 1.435F, -0.1567F, -0.1396F, 0.0086F));

		PartDefinition cube_r374 = bone7.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(-1.305F, -0.1922F, -0.6364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9473F, 0.3201F, 0.735F, 0.1161F, -0.0326F, 0.325F));

		PartDefinition cube_r375 = bone7.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0938F, 0.3627F, 0.0181F, -0.2024F, -0.1667F, 0.4326F));

		PartDefinition cube_r376 = bone7.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-1.4404F, 0.1357F, -1.5496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-1.4404F, 0.2607F, -2.0746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9473F, 0.3201F, 0.735F, -0.2897F, -0.1667F, 0.4326F));

		PartDefinition cube_r377 = bone7.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-0.475F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3116F, -0.4856F, -3.0833F, -0.7164F, -0.5235F, 0.8056F));

		PartDefinition cube_r378 = bone7.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-0.375F, -0.975F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8663F, -0.4479F, -2.5829F, -0.4269F, -0.1487F, 0.4728F));

		PartDefinition cube_r379 = bone7.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(33, 77).mirror().addBox(-0.425F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6897F, -0.2862F, -2.0328F, -0.3892F, -0.134F, 0.5144F));

		PartDefinition cube_r380 = bone7.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.5131F, -0.1245F, -1.4826F, -0.4206F, -0.1667F, 0.4326F));

		PartDefinition cube_r381 = bone7.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(68, 82).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.0797F, -0.5234F, -1.0788F, 0.1014F, -0.1291F, 0.9817F));

		PartDefinition cube_r382 = bone7.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(38, 77).mirror().addBox(-0.493F, -0.5156F, -0.7126F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.846F, -0.537F, -0.7401F, 1.0558F, -0.0791F, 0.866F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.62F, -0.3936F, -4.0547F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6065F, -0.2587F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r383 = Lowerjaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-0.143F, -0.5027F, -2.8154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-0.143F, -0.3027F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-2.032F, 0.2541F, 0.6402F, -0.0262F, -0.0873F, 0.0F));

		PartDefinition cube_r384 = Lowerjaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(84, 84).mirror().addBox(-0.6625F, -0.4071F, 0.2227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2928F, -0.1187F, -3.0525F, 0.2165F, 0.0143F, -0.4721F));

		PartDefinition cube_r385 = Lowerjaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2922F, 0.5207F, -5.3625F, 0.6248F, -0.5355F, -0.6437F));

		PartDefinition cube_r386 = Lowerjaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5363F, 0.5215F, -4.8571F, 0.3987F, -0.2974F, -0.5317F));

		PartDefinition cube_r387 = Lowerjaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.3F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0146F, 0.3803F, -4.4126F, 0.4378F, -0.2334F, -0.6804F));

		PartDefinition cube_r388 = Lowerjaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.325F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2162F, 0.2652F, -3.9357F, 0.3259F, -0.1446F, -0.5636F));

		PartDefinition cube_r389 = Lowerjaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.35F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3685F, 0.19F, -3.358F, 0.3386F, -0.1104F, -0.6634F));

		PartDefinition cube_r390 = Lowerjaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(84, 81).mirror().addBox(-0.6125F, -0.4321F, -0.3523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2928F, -0.1187F, -3.0525F, 0.2182F, -0.122F, -0.5022F));

		PartDefinition cube_r391 = Lowerjaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.2607F, -0.6522F, -1.6818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.6253F, 0.5951F, -2.6577F, 0.1222F, -0.2967F, 0.0F));

		PartDefinition cube_r392 = Lowerjaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.3109F, -2.0605F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.1753F, 0.5951F, -3.9577F, 1.5184F, -0.4538F, 0.0F));

		PartDefinition cube_r393 = Lowerjaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(87, 48).mirror().addBox(-0.4F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(87, 48).addBox(-0.0483F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2759F, 0.7174F, -5.3706F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r394 = Lowerjaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(20, 87).mirror().addBox(-0.3109F, -2.016F, -1.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 87).mirror().addBox(-0.3109F, -1.816F, -1.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1753F, 0.5951F, -3.9577F, 1.213F, -0.4538F, 0.0F));

		PartDefinition cube_r395 = Lowerjaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(-0.3109F, -0.4846F, -1.7037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 73).mirror().addBox(-0.3109F, -0.6096F, -1.7037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.1753F, 0.5951F, -3.9577F, 0.1658F, -0.4538F, 0.0F));

		PartDefinition cube_r396 = Lowerjaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.2607F, -0.8721F, -1.6559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6253F, 0.5951F, -2.6577F, 0.192F, -0.2967F, 0.0F));

		PartDefinition cube_r397 = Lowerjaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.143F, -0.2868F, -1.7226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8553F, -0.3023F, -1.3795F, 0.2269F, -0.0873F, 0.0F));

		PartDefinition cube_r398 = Lowerjaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(87, 37).mirror().addBox(-0.5F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(46, 87).mirror().addBox(-0.5F, -0.475F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(73, 84).mirror().addBox(-0.5F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-1.4105F, 0.4045F, -2.3678F, 0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r399 = Lowerjaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(10, 87).mirror().addBox(-0.143F, -0.4F, -0.6178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 87).mirror().addBox(-0.143F, -0.4F, -1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 69).mirror().addBox(-0.143F, -0.4F, -2.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.032F, 0.2541F, 0.6402F, -0.2138F, -0.0873F, 0.0F));

		PartDefinition cube_r400 = Lowerjaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.143F, -0.7027F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.0223F, 0.6513F, 0.5302F, 0.2793F, -0.0873F, 0.0F));

		PartDefinition cube_r401 = Lowerjaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(78, 86).addBox(-0.857F, -0.7027F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0223F, 0.6513F, 0.5302F, 0.2793F, 0.0873F, 0.0F));

		PartDefinition cube_r402 = Lowerjaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(71, 10).addBox(-0.857F, -0.5027F, -2.8154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F))
				.texOffs(0, 59).addBox(-0.857F, -0.3027F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(2.032F, 0.2541F, 0.6402F, -0.0262F, 0.0873F, 0.0F));

		PartDefinition cube_r403 = Lowerjaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(84, 84).addBox(-0.3375F, -0.4071F, 0.2227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2928F, -0.1187F, -3.0525F, 0.2165F, -0.0143F, 0.4721F));

		PartDefinition cube_r404 = Lowerjaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(49, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2922F, 0.5207F, -5.3625F, 0.6248F, 0.5355F, 0.6437F));

		PartDefinition cube_r405 = Lowerjaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(22, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5363F, 0.5215F, -4.8571F, 0.3987F, 0.2974F, 0.5317F));

		PartDefinition cube_r406 = Lowerjaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(35, 87).addBox(-0.7F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0146F, 0.3803F, -4.4126F, 0.4378F, 0.2334F, 0.6804F));

		PartDefinition cube_r407 = Lowerjaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(30, 87).addBox(-0.675F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2162F, 0.2652F, -3.9357F, 0.3259F, 0.1446F, 0.5636F));

		PartDefinition cube_r408 = Lowerjaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(40, 89).addBox(-0.65F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3685F, 0.19F, -3.358F, 0.3386F, 0.1104F, 0.6634F));

		PartDefinition cube_r409 = Lowerjaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(84, 81).addBox(-0.3875F, -0.4321F, -0.3523F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2928F, -0.1187F, -3.0525F, 0.2182F, 0.122F, 0.5022F));

		PartDefinition cube_r410 = Lowerjaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(30, 73).addBox(-0.7393F, -0.6522F, -1.6818F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.6253F, 0.5951F, -2.6577F, 0.1222F, 0.2967F, 0.0F));

		PartDefinition cube_r411 = Lowerjaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(25, 87).addBox(-0.6891F, -2.0605F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.1753F, 0.5951F, -3.9577F, 1.5184F, 0.4538F, 0.0F));

		PartDefinition cube_r412 = Lowerjaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(20, 87).addBox(-0.6891F, -2.016F, -1.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 87).addBox(-0.6891F, -1.816F, -1.1974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1753F, 0.5951F, -3.9577F, 1.213F, 0.4538F, 0.0F));

		PartDefinition cube_r413 = Lowerjaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(73, 43).addBox(-0.6891F, -0.4846F, -1.7037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(37, 73).addBox(-0.6891F, -0.6096F, -1.7037F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1753F, 0.5951F, -3.9577F, 0.1658F, 0.4538F, 0.0F));

		PartDefinition cube_r414 = Lowerjaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(14, 73).addBox(-0.7393F, -0.8721F, -1.6559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6253F, 0.5951F, -2.6577F, 0.192F, 0.2967F, 0.0F));

		PartDefinition cube_r415 = Lowerjaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(73, 0).addBox(-0.857F, -0.2868F, -1.7226F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8553F, -0.3023F, -1.3795F, 0.2269F, 0.0873F, 0.0F));

		PartDefinition cube_r416 = Lowerjaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(87, 37).addBox(-0.5F, -0.475F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(46, 87).addBox(-0.5F, -0.475F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(73, 84).addBox(-0.5F, -0.475F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.4105F, 0.4045F, -2.3678F, 0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r417 = Lowerjaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(10, 87).addBox(-0.857F, -0.4F, -0.6178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 87).addBox(-0.857F, -0.4F, -1.0178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 69).addBox(-0.857F, -0.4F, -2.4178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(2.032F, 0.2541F, 0.6402F, -0.2138F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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